package com.catedra.catedra2;


import com.example.aci810_control3.MainActivity;
import com.example.aci810_control3.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;



public class AppAvanzar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_avanzar);
		
		SharedPreferences sharedPref = getSharedPreferences("data",Context.MODE_PRIVATE);
		
		
		Boolean radButton0 = sharedPref.getBoolean(App.RADIO_BUT0, false);
		Boolean radButton1 = sharedPref.getBoolean(App.RADIO_BUT1, false);
		Boolean radButton2 = sharedPref.getBoolean(App.RADIO_BUT2, false);
		Boolean swtvalue = sharedPref.getBoolean(App.SWITCH_VALUE, false);
		int sbar = sharedPref.getInt(App.SEEK_BAR,0);  
		
		
		
		RadioButton rbut0 = (RadioButton)findViewById(R.id.radio01);
		
		rbut0.setChecked(radButton0);
		
		RadioButton rbut1 = (RadioButton)findViewById(R.id.radio12);
		
		rbut1.setChecked(radButton1);
		
		RadioButton rbut2 = (RadioButton)findViewById(R.id.radio23);
		
		rbut2.setChecked(radButton2);
		
		SeekBar sb = (SeekBar)findViewById(R.id.seekBar2);
	
		sb.setProgress(sbar);
		
		Switch swt = (Switch)findViewById(R.id.switch2);
		
		swt.setChecked(swtvalue);	
		
		
				
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_avanzar, menu);
		return true;
	}
	
	
	public void Retro(View view){
		Intent intent = new Intent(this,App.class);
		
		startActivity(intent);
}

}
