package com.example.akirachixs;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Welcome_Screen extends Activity implements OnClickListener{

	//declaring of variables
	
	
	Button btnRegister,btnLogin;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome__screen);
		// TODO Auto-generated method stub
		//initialization of variables
		
		

		btnRegister=(Button)findViewById(R.id.btnRegister);
		btnRegister.setOnClickListener(this);
       btnLogin=(Button)findViewById(R.id.btnLogin);
       btnLogin.setOnClickListener(this);
				
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
	     
	     case R.id.btnRegister:
				
				startActivity(new Intent(getApplicationContext(),Register.class));
				
				break;
			
			case R.id.btnLogin:
				startActivity(new Intent(getApplicationContext(),Login.class));
			
		
			

		default:
			break;
			
			
		}
		
	}

	
	}

