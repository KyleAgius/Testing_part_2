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

public class AlertModelTest implements FsmModel {
    //Linking the SUT
    private AlertInteraction systemUnderTest = new AlertInteraction();
    private States state;
    private int AlertCount;

    //Method implementations
    public States getState() {
        return state;
    }

    public void reset(final boolean var1) {
        systemUnderTest.deleteAlerts();

        state = States.EmptyAlerts;
        AlertCount = 0;
    }

    //Transitions incl. guards
    public @Action void createAlert() {
        systemUnderTest.createAlert();

        //Updating model
        state = States.AlertCreated;
        if(AlertCount < 5){
            AlertCount++;
        }

        assertEquals("SUT does not have a valid number of alerts.", AlertCount, systemUnderTest.alertCount);
    }

    public boolean deleteAlertsGuard() {
        return getState().equals(States.AlertCreated);
    }
    public @Action void deleteAlerts() {
        systemUnderTest.deleteAlerts();

        state = States.EmptyAlerts;
        AlertCount = 0;

        assertEquals("SUT did not clear the alerts.", AlertCount, systemUnderTest.alertCount);
    }


    //Test runner
    @Test
    public void AlertInteractionModelRunner() {
        final GreedyTester tester = new GreedyTester(new AlertModelTest());
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
