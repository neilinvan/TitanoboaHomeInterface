package com.example.titanoboahomeinterface;

import com.example.titanoboahomeinterface.R;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DiagnosticScreen extends Activity {
	
	
	private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver(){
	    @Override
		public void onReceive(Context c, Intent i) {
			int level = i.getIntExtra("level", 0);
		    ProgressBar pbhead = (ProgressBar) findViewById(R.id.progressbarhead);
		    pbhead.setProgress(level);
		    ProgressBar pbm1 = (ProgressBar) findViewById(R.id.progressbarm1);
		    pbm1.setProgress(level);
		    ProgressBar pbm2 = (ProgressBar) findViewById(R.id.progressbarm2);
		    pbm2.setProgress(level);
		    ProgressBar pbm3 = (ProgressBar) findViewById(R.id.progressbarm3);
		    pbm3.setProgress(level);
		    ProgressBar pbm4 = (ProgressBar) findViewById(R.id.progressbarm4);
		    pbm4.setProgress(level);
		    TextView tv1 = (TextView )findViewById(R.id.textfieldhead);
		    tv1.setText("Battery Level: "+Integer.toString(level)+"%");
		    TextView tv2 = (TextView )findViewById(R.id.textfieldm1);
		    tv2.setText("Battery Level: "+Integer.toString(level)+"%");
		    TextView tv3 = (TextView )findViewById(R.id.textfieldm2);
		    tv3.setText("Battery Level: "+Integer.toString(level)+"%");
		    TextView tv4 = (TextView )findViewById(R.id.textfieldm3);
		    tv4.setText("Battery Level: "+Integer.toString(level)+"%");
		    TextView tv5 = (TextView )findViewById(R.id.textfieldm4);
		    tv5.setText("Battery Level: "+Integer.toString(level)+"%");
		}
	 };
	 
	
	
	 @Override
		protected void onCreate(Bundle savedInstanceState) {
			
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.diagnostic);
			registerReceiver(mBatInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
			
			
			
		}
	
	
	 
	 
	  

	public void gotohead(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), headscreen.class );
		this.startActivity(intent3);
		
	}
	
	public void gotom1(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), module1screen.class );
		this.startActivity(intent3);
		
	}
	
	public void gotom2(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), module2screen.class );
		this.startActivity(intent3);
		
	}
	
	public void gotom3(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), module3screen.class );
		this.startActivity(intent3);
		
	}
	
	public void gotom4(View view)
	{
		
		Intent intent3 = new Intent(view.getContext(), module4screen.class );
		this.startActivity(intent3);
		
	}
	
	
	
	
	
	
}
