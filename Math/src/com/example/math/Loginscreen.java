package com.example.math;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Loginscreen extends Activity implements OnClickListener { 
	
	//variable declaration
	EditText etmail,etpassword;
	Button btnsubmit,btncancel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginscreen);
		// initialization  of variables
		etmail =(EditText)findViewById(R.id.etemail);
		etpassword=(EditText)findViewById(R.id.etpassword);
		btnsubmit=(Button)findViewById(R.id.button1);
		btnsubmit.setOnClickListener(this);
		btncancel=(Button)findViewById(R.id.button2);
		btncancel.setOnClickListener(this);
		
		
				

	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
			case R.id.btnsubmit:
				startActivity(new Intent(getApplicationContext(),Homescreen.class));
			break;
		case R.id.btncancel:
			  startActivity(new Intent(getApplicationContext(),Welcomeactivityscreen.class));
			break;
		
			

		default:
			break;
		}
		
	}



}
