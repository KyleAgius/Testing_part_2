package main;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.io.IOException;

public class PostManager {
    HttpClient httpClient;
    public PostManager(HttpClient inp_client){
        httpClient = inp_client;
    }

    public String GetStatus(String id) {
        try{
        	HttpGet get = new HttpGet("https://api.marketalertum.com/EventsLog/"+id);
            HttpResponse response = httpClient.execute(get);
            return EntityUtils.toString(response.getEntity());
        } catch (ClientProtocolException e) {
            return "ClientProtocolException";
        } catch (IOException e) {
            return "IOException";
        }

    }
    
    public boolean IsLoggedIn(String id) {
        try{
        	HttpGet get = new HttpGet("https://api.marketalertum.com/EventsLog/"+id+"/login-status");
            HttpResponse response = httpClient.execute(get);
            String result = EntityUtils.toString(response.getEntity());
            JSONObject jsonres = new JSONObject(result);
			
            return jsonres.getBoolean("isLoggedInOnWebsite");
        } catch (ClientProtocolException e) {
            return false;
        } catch (IOException e) {
            return false;
        }catch (JSONException e) {
			return false;
		}

    }
}
