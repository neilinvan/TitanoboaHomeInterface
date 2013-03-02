package com.example.titanoboahomeinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class headscreen extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.head);
	}
	
	public void onGotoDScreen(View view)
    {
		
		Intent intent = new Intent(view.getContext(), DiagnosticScreen.class );
		this.startActivity(intent);
	}

}
