package com.example.titanoboahomeinterface;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ScreenOne extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen_one);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.screen_one, menu);
		return true;
	}
	
	public void onGotoDiagnosticScreen(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), DiagnosticScreen.class );
		this.startActivity(intent3);
		
	}
	
	public void onGotoControlScreen(View view)
	{
		
		Intent intent2 = new Intent(view.getContext(), Control.class);
		this.startActivity(intent2);
	}

}
