package com.catedra.catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Perfil extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfil);
		// get preferences
		SharedPreferences sharedPref = getSharedPreferences("data",	Context.MODE_PRIVATE);

		// get values from preferences
		String nombreusuario = sharedPref.getString(SignIn3.NAME_VALUE,
				"not set");
		String pass = sharedPref.getString(SignIn3.PASS_VALUE, "not set");
		String namepers = sharedPref.getString(SignIn3.NAMEPERS_VALUE,
				"not set");
		String emailpers = sharedPref.getString(SignIn3.EMAILPERS_VALUE,
				"not set");
		String edadpers = sharedPref.getString(SignIn3.EDADPERS_VALUE,
				"not set");
		String numerpers = sharedPref.getString(SignIn3.NUMERPERS_VALUE,
				"not set");

		// edit text for name field
		TextView nameTextView = (TextView) findViewById(R.id.usuarioform);
		// set name text into the component
		nameTextView.setText(nombreusuario);

		// edit text for name field
		TextView passTextView = (TextView) findViewById(R.id.passform);
		// set email text into the component
		passTextView.setText(pass);

		// edit text for name field
		TextView namepersTextView = (TextView) findViewById(R.id.nameform);
		// set name as string
		namepersTextView.setText(namepers);

		// edit text for email field
		TextView emailpersTextView = (TextView) findViewById(R.id.emailform);
		// get email as string
		emailpersTextView.setText(emailpers);

		// get text as string
		TextView fechanaciTextView = (TextView) findViewById(R.id.edadform);
		// get fecha nacimiento as string
		fechanaciTextView.setText(edadpers);

		TextView telefonopersTextView = (TextView) findViewById(R.id.telefonoform);
		// get telefono as string
		telefonopersTextView.setText(numerpers);

		// Show the Up button in the action bar.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.perfil, menu);
		return true;
	}

	public void ConfirmarPerfil(View view) {
		Intent intent;
		intent = new Intent(this, Login.class);

		// initialise new activity
		startActivity(intent);

	}
	
	public final static String NAME_VALUE = "com.catedra.catedra2.NAME_VALUE";
	public final static String PASS_VALUE = "com.catedra.catedra2.PASS_VALUE";
	public final static String NAMEPERS_VALUE = "com.catedra.catedra2.NAMEPERS_VALUE";
	public final static String EMAILPERS_VALUE = "com.catedra.catedra2.EMAILPERS_VALUE";
	public final static String EDADPERS_VALUE = "com.catedra.catedra2.EDADPERS_VALUE";
	public final static String NUMERPERS_VALUE = "com.catedra.catedra2.NUMERPERS_VALUE";
	
	
	
	public void EditarPerfil(View view){
			Intent intent = new Intent(this, EditarPerfil.class);

			// edit text for name field
			TextView nombreusuarioTextView = (TextView) findViewById(R.id.usuarioform);
			// get name as string
			String nombreusuario = nombreusuarioTextView.getText().toString();

			// edit text for email field
			TextView passTextView = (TextView) findViewById(R.id.passform);
			// get email as string
			String pass = passTextView.getText().toString();

			// edit text for name field
			TextView namepersTextView = (TextView) findViewById(R.id.nameform);
			// get name as string
			String namepers = namepersTextView.getText().toString();

			// edit text for email field
			TextView emailpersTextView = (TextView) findViewById(R.id.emailform);
			// get email as string
			String emailpers = emailpersTextView.getText().toString();

			// get text as string
			TextView fechanaciTextView = (TextView) findViewById(R.id.edadform);
			// get fecha nacimiento as string
			String fechanaci = fechanaciTextView.getText().toString();

			// get text as string
			TextView telefonopersTextView = (TextView) findViewById(R.id.telefonoform);
			// get telefono as string
			String telefonopers = telefonopersTextView.getText().toString();

			// get preferences
			SharedPreferences sharedPref = getSharedPreferences("data",	Context.MODE_PRIVATE);
			// get preferences editor
			SharedPreferences.Editor editor = sharedPref.edit();
			// add data to preferences
			editor.putString(NAME_VALUE, nombreusuario);
			editor.putString(PASS_VALUE, pass);
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


