package com.example.math;


import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class Registerscreen extends Activity implements OnClickListener {
	//Declaration of variables
 EditText etfirstname, etidno,etemail,etpassword;
	
	Button btnsubmit;
	Button btncancel;
	Spinner spinner1;
	Textview tvspinner1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialization of variables
		etfirstname	=(EditText) findViewById(R.id.etfirstname);
		etidno =(EditText)findViewById(R.id.etidno);
		etemail=(EditText)findViewById(R.id.etemail);
		etpassword=(EditText)findViewById(R.id.etpassword);
		//add strings to

		ArrayList<String> list = new ArrayList<String>();
		list.add("Nairobi");
		list.add("Kisumu");
		list.add("Mombasa");
		
	
		
		
		
		
		
		
		btnsubmit = (Button) findViewById(R.id.button2);
		btnsubmit.setOnClickListener(this);
		btncancel = (Button) findViewById(R.id.button1);
		btncancel.setOnClickListener( this);}
		
		

		public void onClick(View v){
			switch (v.getId()) {
			
			case R.id.btnsubmit:
				Toast.makeText(Registerscreen.this, "get it", Toast.LENGTH_LONG).show();
				startActivity(new Intent(getApplicationContext(),Homescreen.class));
				break;
			case R.id.btncancel:
				Toast.makeText(Registerscreen.this,"get it",  Toast.LENGTH_LONG).show();
				startActivity(new Intent(getApplicationContext(),Loginscreen.class));
			default:
				break;
			}
			
			
	}
		
	}
	
	


	
		
	