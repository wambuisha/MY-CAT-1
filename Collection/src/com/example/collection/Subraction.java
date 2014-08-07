package com.example.collection;




import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Subraction extends Activity implements OnClickListener{

	//variable declaration
	EditText etNumber_one,etNumber_two ,etResult;
	Button btnsubtract;
	String strNumber_one,strNumber_two ,strResult;
	double Number_one;
	double Number_two;
	double Result;
	
	Operation Calc;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subraction);
		
		
		
		// TODO Auto-generated method stub
		//initialization of variables
		
		
    etNumber_one= (EditText)findViewById(R.id.etNumber_One);
    etNumber_two= (EditText)findViewById(R.id.etNumber_Two);
    etResult= (EditText)findViewById(R.id.etResult);
				
     btnsubtract= (Button)findViewById(R.id.btnSubtract);
     btnsubtract.setOnClickListener(this);
				
	}



	@Override
	
		// TODO Auto-generated method stub
		public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnSubtract:
			//change the string to double
			strNumber_one=etNumber_one.getText().toString();
			strNumber_two=etNumber_two.getText().toString();
			
			
			//change from double to string
			double number_one=Double.parseDouble(strNumber_one);
			double number_two=Double.parseDouble(strNumber_two);
			Object calc;
			double result= Operation.subtraction(number_one, number_two);
			String ans = String.valueOf(result);
			etResult.setText(ans);
			
		
			default:
			break;
		}
	}
	 
			
				
		
		
	
		
	}

	
	

