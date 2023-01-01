package main;

import java.util.Timer;

public class mainProgram {
	public static void main(String args[])
    {		
		//poll 		
		Timer timer = new Timer();
		timer.schedule(new EventLogQuery(), 0, 5000);
			  
    }
	
		
}
