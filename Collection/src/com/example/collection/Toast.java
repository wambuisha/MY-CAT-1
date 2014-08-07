package com.example.collection;


import android.app.Activity;
import android.os.Bundle;

import android.view.View.OnClickListener;
import android.widget.Button;


public class Toast extends Activity {

	//declaring of variables
	Button btnToast;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast);
		// TODO Auto-generated method stub
		//initialization of variables
		
    ;

   btnToast= (Button)findViewById(R.id.btnToast);
   btnToast.setOnClickListener((OnClickListener) this);
				
	}

	
	}

