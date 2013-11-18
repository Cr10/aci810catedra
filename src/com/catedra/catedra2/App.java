package com.catedra.catedra2;






import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;





public class App extends Activity {
	
	
	public final static String RADIO_GROUP = "com.catedra.catedra2.RADIO_GROUP";
	public final static String RADIO_BUT0 = "com.catedra.catedra2.RADIO_BUT0";
	public final static String RADIO_BUT1 = "com.catedra.catedra2.RADIO_BUT1";
	public final static String RADIO_BUT2 = "com.catedra.catedra2.RADIO_BUT2";
	public final static String SEEK_BAR = "com.catedra.catedra2.SEEK_BAR";
	public final static String SWITCH_VALUE = "com.catedra.catedra2.SWITCH_VALUE";
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app);
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app, menu);
		return true;
	}
	
	
	public void onClickAvanzar(View view){
		Intent intent = new Intent(this,AppAvanzar.class);
		
		
		RadioGroup rg= (RadioGroup)findViewById(R.id.radioGroup1);
		int r0 =  rg.getCheckedRadioButtonId();
		RadioButton rb0 = (RadioButton)findViewById(R.id.radio0);
		Boolean rbut0 = rb0.isChecked();
		RadioButton rb1 = (RadioButton)findViewById(R.id.radio1);
		Boolean rbut1 = rb1.isChecked();
		RadioButton rb2 = (RadioButton)findViewById(R.id.radio2);
		Boolean rbut2 = rb2.isChecked();
		SeekBar sb = (SeekBar)findViewById(R.id.seekBar1);
		int seekB = sb.getProgress();
		Switch swt = (Switch)findViewById(R.id.switch1);
		Boolean swtvalue = swt.isChecked();
		
		
		
		SharedPreferences sharedPref = getSharedPreferences("data",Context.MODE_PRIVATE);
		
		SharedPreferences.Editor editor = sharedPref.edit();
		
		
		editor.putInt(RADIO_GROUP, r0);
		editor.putBoolean(RADIO_BUT0, rbut0);
		editor.putBoolean(RADIO_BUT1, rbut1);
		editor.putBoolean(RADIO_BUT2, rbut2);
		editor.putInt(SEEK_BAR, seekB);
		editor.putBoolean(SWITCH_VALUE, swtvalue);
		
		editor.commit();
		startActivity(intent);
	}
	
	public void Perfil(View view){
		Intent intent = new Intent(this,Perfil2.class);
		
		startActivity(intent);
	}
		
	public void CerrarSesion(View view){
			Intent intent = new Intent(this,Login.class);
			
			startActivity(intent);
	}
	
	
	
	

}
