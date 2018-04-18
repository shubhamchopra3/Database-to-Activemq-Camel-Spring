package sample.camel;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.google.gson.Gson;

public class NewBean {
	
	 private Random ran = new Random();

	 public Map<String, Object> generateNewInsert(String msg) {
		 HashMap<String,Object> hm1 = new Gson().fromJson(msg, new HashMap<String, String>().getClass());  //converts string which is in json format to hashmap of key value pair 
		 return hm1;
	
}
	 
	 
	 public void processNewTopic(Map<String, Object> data) {
	       // return "Processed NewTransaction id " + data.get("id") + " Name " 
			//+ data.get("name")
			//+ " of " + data.get("purpose");
		 System.out.println( data.get("id") +""+ data.get("name"));
	    }
}
