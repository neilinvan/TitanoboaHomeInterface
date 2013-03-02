package com.example.titanoboahomeinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Control extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	
	{
				super.onCreate(savedInstanceState);
				setContentView(R.layout.control);
				
	}
	
    public void onGotoHomeScreen(View view)
    {
		
		Intent intent = new Intent(view.getContext(), ScreenOne.class );
		this.startActivity(intent);
	}

}
