package com.example.collection;


import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Spinner extends Activity implements OnClickListener {

	//declaring of variables
	
	EditText ettext;
	Button btndisplay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		// TODO Auto-generated method stub
				//initialization of variables
				
		ettext=(EditText)findViewById(R.id.ettext);
		
		btndisplay= (Button)findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
						
	}




	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	}
	}
	
		
	

	