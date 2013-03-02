package com.example.titanoboahomeinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class module3screen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.module3);
		
	}
	
	public void onGotoDScreen(View view)
    {
		
		Intent intent = new Intent(view.getContext(), DiagnosticScreen.class );
		this.startActivity(intent);
	}


}
