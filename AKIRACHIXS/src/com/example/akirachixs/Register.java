package com.example.akirachixs;






import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity implements OnClickListener{
	
//declaring of variables
	
	EditText etUsername,etPassword,etEmail;
	Button btnDisplay,btnBack;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		// TODO Auto-generated method stub
				//initialization of variables
				
				etUsername=(EditText)findViewById(R.id.etUser_name);
				etEmail=(EditText)findViewById(R.id.etEmail);
				etPassword=(EditText)findViewById(R.id.etPassword);

				btnDisplay=(Button)findViewById(R.id.btnDisplay);
				btnDisplay.setOnClickListener(this);
		        btnBack=(Button)findViewById(R.id.btnBack);
		        btnBack.setOnClickListener(this);
						
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.btnDisplay:
			Toast.makeText(Register.this, "My details", Toast.LENGTH_LONG).show();
			
			
			break;
		case R.id.btnBack:
			startActivity(new Intent(getApplicationContext(),Welcome_Screen.class));
		
	
		

	default:
		break;
		
		
	}

	
	}
}

