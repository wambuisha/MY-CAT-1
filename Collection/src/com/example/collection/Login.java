package com.example.collection;






import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity implements OnClickListener{
	
	
	//declaring of variables
	EditText etuser_name,etpassword,etshow_password;
	Button btnToast,btnBack;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		// TODO Auto-generated method stub
				//initialization of variables
		
				etuser_name=(EditText)findViewById(R.id.etusername);
				etpassword=(EditText)findViewById(R.id.etpassword);
				etshow_password=(EditText)findViewById(R.id.etshow_password);
				
				btnToast=(Button)findViewById(R.id.btnToast);
				btnToast.setOnClickListener(this);
				btnBack=(Button)findViewById(R.id.btnBack);
				btnBack.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	
	
}

