package com.example.collection;


import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;

public class Webviewactivity extends Activity {
	
	WebView webview1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webviewactivity);
		
		//initialization
		
		webview1=(WebView)findViewById(R.id.webView1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.loadUrl("http://www.google.com");
	}

	}

