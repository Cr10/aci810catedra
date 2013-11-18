package com.catedra.catedra2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class SignIn extends Activity {

	public final static String NAME_VALUE = "com.catedra.catedra2.NAME_VALUE";
	public final static String PASS_VALUE = "com.catedra.catedra2.PASS_VALUE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_in, menu);
		return true;
	}

	public void ClickRegistrar1(View view) {
		Intent intent = new Intent(this, SignIn2.class);

		// edit text for name field
		EditText nombreusuarioEditText = (EditText) findViewById(R.id.etnombreusuario);
		// get name as string
		String nombreusuario = nombreusuarioEditText.getText().toString();

		// edit text for email field
		EditText passEditText = (EditText) findViewById(R.id.etpassword);
		// get email as string
		String pass = passEditText.getText().toString();

		// get preferences
		SharedPreferences sharedPref = getSharedPreferences("data",
				Context.MODE_PRIVATE);
		// get preferences editor
		SharedPreferences.Editor editor = sharedPref.edit();
		// add data to preferences
		editor.putString(NAME_VALUE, nombreusuario);
		editor.putString(PASS_VALUE, pass);

		// commit values to the property file
		editor.commit();

		// initialise new activity
		startActivity(intent);
	}

}
