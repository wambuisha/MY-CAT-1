package com.example.collection;


import java.util.ArrayList;
import java.util.Arrays;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends Activity implements OnClickListener{
	private ListView listView;
	private ArrayAdapter<String>stringArrayAdapter;
	String[]items={"addition","Subraction","login form","webview","Increment and Decrement",
			"Button toast","count"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
			class list extends Activity implements OnItemClickListener{

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					
				} 
		}
			   
		   
		    String []items = {"Addition","Subtraction","Login Form","webview","Increament and Decreament","Button Toast","Countries","Tab Activity"};

		    
		      //Initialization
		          listView = (ListView) findViewById(R.id.listView1);
		         
		          ArrayList<String> itemList = new ArrayList<String>();
		          itemList.addAll(Arrays.asList(items));
		         
		          //Design the ListView
		          stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list,itemList);
		          listView.setAdapter(stringArrayAdapter);
		          listView.setOnClickListener(this);
	}
		    

		public void onItemClick(AdapterView<?> parent, View view, int position,
		        long id) {
		    switch (position) {
		    case 0:
		        startActivity(new Intent(getApplicationContext(),Login.class));
		        break;
		      
		    case 1:
		        startActivity(new Intent(getApplicationContext(),Increment.class));
		        break;
		      
		    case 2:
		        startActivity(new Intent(getApplicationContext(),Homescreen.class));
		         break;
		       
		     case 3:
		         startActivity(new Intent(getApplicationContext(),Toast.class));
		        break;

		     case 4:
		         startActivity(new Intent(getApplicationContext(),Subraction.class));
		        break;

		     case 5:
		        startActivity(new Intent(getApplicationContext(),Spinner.class));
		       break;
		      
		     case 6:
		         startActivity(new Intent(getApplicationContext(),List.class));
		        break;
		        case 7:
		        	startActivity(new Intent(getApplicationContext(),Webviewactivity.class));

		    default:
		        break;
		    }
		}


		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
}
		   
		   
	


	