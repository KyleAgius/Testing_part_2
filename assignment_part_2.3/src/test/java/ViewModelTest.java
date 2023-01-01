import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.StopOnFailureListener;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.coverage.ActionCoverage;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionPairCoverage;
import org.example.AlertInteraction;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ViewModelTest implements FsmModel {
    //Linking the SUT
    private AlertInteraction systemUnderTest = new AlertInteraction();
    private States state;
    private boolean LoggedIn;

    //Method implementations
    public States getState() {
        return state;
    }

    public void reset(final boolean var1) {
        state = States.UserLoggedOut;
        LoggedIn = false;
    }

    //Transitions
    public boolean logInGuard() {
        return getState().equals(States.UserLoggedOut);
    }
    public @Action void logIn() {
        systemUnderTest.logIn();

        //Updating model
        state = States.UserLoggedIn;
        LoggedIn = true;

        assertEquals("SUT did not log in properly.", true, systemUnderTest.loggedIn);
    }

    public boolean logOutGuard() {
        return !getState().equals(States.UserLoggedOut);
    }
    public @Action void logOut() {
        systemUnderTest.logOut();

        //Updating model
        state = States.UserLoggedOut;
        LoggedIn = false;

        assertEquals("SUT did not log in properly.", false, systemUnderTest.loggedIn);
    }

    public boolean ViewAlertsGuard() {
        return !getState().equals(States.UserLoggedOut);
    }
    public @Action void ViewAlerts() {
        systemUnderTest.viewAlerts();

        //Updating model
        state = States.UserViewedAlerts;

        assertEquals("Viewing alert without being logged in.", true, systemUnderTest.loggedIn);
    }

    //Test runner
    @Test
    public void AlertInteractionModelRunner() {
        final GreedyTester tester = new GreedyTester(new ViewModelTest());
        tester.setRandom(new Random());
        tester.buildGraph();
        tester.addListener(new StopOnFailureListener());
        tester.addListener("verbose");
        tester.addCoverageMetric(new TransitionPairCoverage());
        tester.addCoverageMetric(new StateCoverage());
        tester.addCoverageMetric(new ActionCoverage());
        tester.generate(500);
        tester.printCoverage();
    }
}
