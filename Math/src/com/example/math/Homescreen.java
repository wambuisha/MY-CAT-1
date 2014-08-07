package com.example.math;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Homescreen extends Activity implements OnClickListener {
	//declaring of variables
			EditText etnumber_one,etnumber_two,etresult ;
			Button btnadd ,btnsubtract ,btndivision,btnmultiply;
			String strnumber_one,strnumber_two,strresult;
		
			operation calc;
			TextView tvresults;
			//This is the main
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		//initialization of variables
		etnumber_one =(EditText)findViewById(R.id.etNumberone);
		etnumber_two=(EditText)findViewById(R.id.etnumber_two);
		etresult=(EditText)findViewById(R.id.etresult);
		
		btnadd=(Button)findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		btnsubtract=(Button)findViewById(R.id.btnsubtract);
		btnsubtract.setOnClickListener(this);
		btndivision=(Button)findViewById(R.id.btndivision);
		btndivision.setOnClickListener(this);
		btnmultiply=(Button)findViewById(R.id.btnmultiply);
		btnmultiply.setOnClickListener(this);
		
		operation calc= new operation();
	}
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnadd:
			//change the string to double
			strnumber_one=etnumber_one.getText().toString();
			strnumber_two=etnumber_two.getText().toString();
			
			//change from double to string
			double number_one=Double.parseDouble(strnumber_one);
			double number_two=Double.parseDouble(strnumber_two);
			double result= calc.addition(number_one, number_two);
			String ans = String.valueOf(result);
			tvresults.setText(ans);
			
			break;
		case R.id.btnsubtract:
			//change the string to double
			strnumber_one=etnumber_one.getText().toString();
			strnumber_two=etnumber_two.getText().toString();
			
			//change from double to string
			double NO1=Double.parseDouble(strnumber_one);
			double NO2=Double.parseDouble(strnumber_two);
			double ANS=calc.subtraction(NO1, NO2);
			String RESULT = String.valueOf(ANS);
			tvresults.setText(RESULT);
			
			break;
		case R.id.btndivision:
			//change the string to double
			strnumber_one=etnumber_one.getText().toString();
			strnumber_two=etnumber_two.getText().toString();
			
			//change from double to string
			double N1=Double.parseDouble(strnumber_one);
			double N2=Double.parseDouble(strnumber_two);
			double AN=calc.division(N1, N2);
			String RST = String.valueOf(AN);
			tvresults.setText(RST);
			
			break;
		case R.id.btnmultiply:
			//change the string to double
			strnumber_one=etnumber_one.getText().toString();
			strnumber_two=etnumber_two.getText().toString();
			
			//change from double to string
			double NOM1=Double.parseDouble(strnumber_one);
			double NOM2=Double.parseDouble(strnumber_two);
			double ANSE=calc.subtraction(NOM1, NOM2);
			String RESUT = String.valueOf(ANSE);
			tvresults.setText(RESUT);
			default:
			break;
		}
	}
	 
			
				
		
		
	}
		
		
		
	
		
		
		
		
		
		
		
	


