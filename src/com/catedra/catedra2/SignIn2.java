package com.catedra.catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin2);

		// get preferences
		SharedPreferences sharedPref = getSharedPreferences("data",
				Context.MODE_PRIVATE);

		// get values from preferences
		String nombreusuario = sharedPref.getString(SignIn.NAME_VALUE,
				"not set");
		String pass = sharedPref.getString(SignIn.PASS_VALUE, "not set");

		// edit text for name field
		TextView nameTextView = (TextView) findViewById(R.id.tvusuario);
		// set name text into the component
		nameTextView.setText(nombreusuario);

		// edit text for name field
		TextView passTextView = (TextView) findViewById(R.id.tvpassword);
		// set email text into the component
		passTextView.setText(pass);

		// Show the Up button in the action bar.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_in2, menu);
		return true;
	}

	public final static String NAMEPERS_VALUE = "com.catedra.catedra2.NAMEPERS_VALUE";
	public final static String EMAILPERS_VALUE = "com.catedra.catedra2.EMAILPERS_VALUE";
	public final static String EDADPERS_VALUE = "com.catedra.catedra2.EDADPERS_VALUE";
	public final static String NUMERPERS_VALUE = "com.catedra.catedra2.NUMERPERS_VALUE";

	public void ClickFinalRegistrar(View view) {
		Intent intent = new Intent(this, SignIn3.class);

		// edit text for name field
		EditText namepersEditText = (EditText) findViewById(R.id.namepers);
		// get name as string
		String namepers = namepersEditText.getText().toString();

		// edit text for email field
		EditText emailpersEditText = (EditText) findViewById(R.id.emailpers);
		// get email as string
		String emailpers = emailpersEditText.getText().toString();
		// get text as string
		EditText fechanaciEditText = (EditText) findViewById(R.id.edadpers);
		// get fecha nacimiento as string
		String fechanaci = fechanaciEditText.getText().toString();
		// get text as string
		EditText telefonopersEditText = (EditText) findViewById(R.id.numerpers);
		// get telefono as string
		String telefonopers = telefonopersEditText.getText().toString();

		// get preferences
		SharedPreferences sharedPref = getSharedPreferences("data",
				Context.MODE_PRIVATE);
		// get preferences editor
		SharedPreferences.Editor editor = sharedPref.edit();
		// add data to preferences
		editor.putString(NAMEPERS_VALUE, namepers);
		editor.putString(EMAILPERS_VALUE, emailpers);
		editor.putString(EDADPERS_VALUE, fechanaci);
		editor.putString(NUMERPERS_VALUE, telefonopers);
		// commit values to the property file
		editor.commit();

		// initialise new activity
		startActivity(intent);
	}

}
