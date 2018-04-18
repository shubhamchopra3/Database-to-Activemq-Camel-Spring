/*package sample.camel;

import java.util.Arrays;
import java.util.HashSet;

import javax.jms.JMSException;
import javax.jms.Message;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;



@Service("databaseService")
public class DatabaseService {

	@Autowired
	BookRepository books;
	
	@Autowired
	 TransactionRepository trans;

	/*public void printjson(String msg) {
		Gson g = new Gson();
		System.out.println("Printing message from Queue: " + msg);
		Object obj = JSONValue.parse(msg);
		JSONObject jsonObject = (JSONObject) obj;
		HashSet<String> s = new HashSet<String>(jsonObject.keySet());
		System.out.println("printing hash set");
		System.out.println(s);
		
		HashSet<String> Bookdatabase = new HashSet<String>(Arrays.asList("id","item","description"));
		HashSet<String> transactiondataabse = new HashSet<String>(Arrays.asList("id","name","purpose"));
		
		if(Bookdatabase.equals(s)){
			System.out.println("equal hai");
				// use gson to conver json to object
				BooksTable b1 = g.fromJson(msg, BooksTable.class);
				// System.out.println(b1.getId()); //debugging purpose
				addBook(b1);
		}
		else if(transactiondataabse.equals(s))
		{
			System.out.println("Transaction table");
			TransactionTable t1 = g.fromJson(msg, TransactionTable.class);
			addtransaction(t1);
		}

	}
*/
	
	/*
	public void processBook(String msg) {
		//System.out.println("In process book: "+message);
		Object obj1 = JSONValue.parse(msg);
	    JSONObject jsonObject1 = (JSONObject) obj1;
	    String data = (String)jsonObject1.get("data").toString();
		Gson g = new Gson(); 
		BooksTable b1 = g.fromJson(data, BooksTable.class);
		addBook(b1);
		System.out.println("Record successfully inserted");
	}
	public void processTransaction(String msg) {
		//System.out.println("In process music: "+message);
		Object obj1 = JSONValue.parse(msg);
	    JSONObject jsonObject1 = (JSONObject) obj1;
	    String data = (String)jsonObject1.get("data").toString();
		Gson g = new Gson(); 
		TransactionTable t1 = g.fromJson(data, TransactionTable.class);
		//System.out.println("Music string: "+m1);
		addtransaction(t1);
		System.out.println("Record successfully inserted");
	}
	
	
	public void addBook(BooksTable b1) {
		System.out.println("inserting into books table");
		System.out.println(b1.getId());
		books.insert(b1);
	}
	
	public void addtransaction(TransactionTable t1) {
		System.out.println("inserting into transaction table");
		System.out.println(t1.getId());
		trans.inserttx(t1);
	}
	
	
	
}
*/