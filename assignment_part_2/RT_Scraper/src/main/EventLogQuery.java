package main;

import java.util.TimerTask;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventLogQuery extends TimerTask {
	PostManager post;
	boolean isLoggedIn;
	
	public EventLogQuery(){	
		@SuppressWarnings("deprecation")
		HttpClient client = new DefaultHttpClient();
		post = new PostManager(client);
		
		isLoggedIn = post.IsLoggedIn("f9d4119e-c37e-4af5-9a52-eec8744ff433");
		if(isLoggedIn){
			LogIn();
		}
	}
	
	public void run(){
		
		String json = post.GetStatus("f9d4119e-c37e-4af5-9a52-eec8744ff433");

		try {
			JSONArray jsonarray = new JSONArray(json);
			for (int i = 0; i < jsonarray.length(); i++) {
			    JSONObject jsonobject = jsonarray.getJSONObject(i);
			    int event = jsonobject.getInt("eventLogType");
			    
			    switch(event) {
				    case 0:
				    	CreateAlert();
				    	break;
				    case 1:
				        ClearAlerts();
				    	break;
				    case 5:
				    	LogIn();
					    break;
				    case 6:
				    	LoggedOut();
					    break;
				    case 7:
				    	ViewedAlerts();
					    break;
				    default:
				      // code block
				  }
			    
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static void CreateAlert(){
		System.out.println("Alert Created");
	}
	
	public static void ClearAlerts(){
		System.out.println("Alerts Deleted");
	}
	
	public static void LogIn(){
		System.out.println("User Logged In");
	}	

	public static void LoggedOut(){
		System.out.println("User Logged Out");
	}
	
	public static void ViewedAlerts(){
		System.out.println("Alerts Viewed");
	}

}
