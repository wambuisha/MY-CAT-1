package com.example.collection;


import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Increment extends Activity implements OnClickListener{

	//variable declaration
	EditText etEnter_number,etresult;
	Button btnincrement,btndecrement;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_increment);
			// TODO Auto-generated method stub
					//initialization of variables
					
					
			etEnter_number=(EditText)findViewById(R.id.etEnter_number);
			etresult=(EditText)findViewById(R.id.etresult);
							
			btnincrement=(Button)findViewById(R.id.btnincrement);
			btnincrement.setOnClickListener(this);
			btndecrement=(Button)findViewById(R.id.btndecrement);
						
	
	
	
	

	
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
	
	



