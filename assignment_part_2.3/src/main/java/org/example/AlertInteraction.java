package org.example;

public class AlertInteraction {
    public boolean loggedIn = false;
    public int alertCount = 0;

    public void logIn(){
        loggedIn = true;
        System.out.println("User Logged In");
    }

    public void logOut(){
        loggedIn = false;
        System.out.println("User Logged Out");
    }

    public void viewAlerts(){
        System.out.println("Viewed " + alertCount + " Alerts");
    }

    public void createAlert(){
        if(alertCount < 5) { alertCount++; }
        System.out.println("Created Alert");
        System.out.println("Storing " + alertCount + " Alerts");
    }

    public void deleteAlerts(){
        alertCount = 0;
        System.out.println("All Alerts Deleted");
    }
}
