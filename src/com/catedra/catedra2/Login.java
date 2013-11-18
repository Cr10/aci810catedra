package com.catedra.catedra2;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;


import android.os.Bundle;

import android.view.Menu;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {

	EditText editName;
	EditText editPass;
	Button btnlogin;
	String uss2 = null;
	String name = null;
	String pass = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		editName = (EditText) findViewById(R.id.editText);
		editPass = (EditText) findViewById(R.id.editText2);

		SharedPreferences sharedPref = getSharedPreferences("data",
				Context.MODE_PRIVATE);
		name = sharedPref.getString(SignIn.NAME_VALUE, "");
		pass = sharedPref.getString(SignIn.PASS_VALUE, "");

		// get values from preferences
		uss2 = sharedPref.getString(SignIn.NAME_VALUE, "");

		String uss = sharedPref.getString("uss", "");
		String pas = sharedPref.getString("pas", "");

		if (uss.equals(name) && pas.equals(pass)) {

			Intent in = new Intent(this, Login.class);
			startActivity(in);	}

		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	public void ClickSignIn(View view) {
		Intent intent;
		intent = new Intent(this, SignIn3.class);

		// initialise new activity
		startActivity(intent);

	}

	public final static String USS_VALUE = "com.catedra.catedra2.USS_VALUE";
	public final static String PAS_VALUE = "com.catedra.catedra2.PAS_VALUE";

	public void ClickPerfil(View view) {

		if (editName.getText().toString().equals(name)
				&& editPass.getText().toString().equals(pass)) {

			Intent intent;
			intent = new Intent(this, App.class);

			// initialise new activity
			startActivity(intent);
		} else {
			Toast.makeText(getApplicationContext(),
					"El usuario no es correcto", Toast.LENGTH_LONG).show();
		}

	}

}
