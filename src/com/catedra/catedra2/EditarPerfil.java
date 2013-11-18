package com.catedra.catedra2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class EditarPerfil extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editar_perfil);
		

		// get preferences
		SharedPreferences sharedPref = getSharedPreferences("data",	Context.MODE_PRIVATE);

		// get values from preferences
		String nombreusuario = sharedPref.getString(Perfil.NAME_VALUE,
				"");
		String pass = sharedPref.getString(Perfil.PASS_VALUE, "not set");
		String namepers = sharedPref.getString(Perfil.NAMEPERS_VALUE,
				"");
		String emailpers = sharedPref.getString(Perfil.EMAILPERS_VALUE,
				"");
		String edadpers = sharedPref.getString(Perfil.EDADPERS_VALUE,
				"");
		String numerpers = sharedPref.getString(Perfil.NUMERPERS_VALUE,
				"");

		// edit text for name field
		EditText nameEditText = (EditText) findViewById(R.id.tvusuario);
		// set name text into the component
		nameEditText.setText(nombreusuario);

		// edit text for name field
		EditText passEditText = (EditText) findViewById(R.id.tvpassword);
		// set email text into the component
		passEditText.setText(pass);

		// edit text for name field
		EditText namepersEditText = (EditText) findViewById(R.id.namepers);
		// set name as string
		namepersEditText.setText(namepers);

		// edit text for email field
		EditText emailpersEditText = (EditText) findViewById(R.id.emailpers);
		// get email as string
		emailpersEditText.setText(emailpers);

		// get text as string
		EditText fechanaciEditText = (EditText) findViewById(R.id.edadpers);
		// get fecha nacimiento as string
		fechanaciEditText.setText(edadpers);

		EditText telefonopersEditText = (EditText) findViewById(R.id.numerpers);
		// get telefono as string
		telefonopersEditText.setText(numerpers);

		// Show the Up button in the action bar.
	}
		
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.editar_perfil, menu);
		return true;
	}
	
	public final static String NAME_VALUE = "com.catedra.catedra2.NAME_VALUE";
	public final static String PASS_VALUE = "com.catedra.catedra2.PASS_VALUE";
	public final static String NAMEPERS_VALUE = "com.catedra.catedra2.NAMEPERS_VALUE";
	public final static String EMAILPERS_VALUE = "com.catedra.catedra2.EMAILPERS_VALUE";
	public final static String EDADPERS_VALUE = "com.catedra.catedra2.EDADPERS_VALUE";
	public final static String NUMERPERS_VALUE = "com.catedra.catedra2.NUMERPERS_VALUE";

	public void ClickPerfil(View view) {
		Intent intent = new Intent(this, Perfil.class);

		// edit text for name field
		EditText nombreusuarioEditText = (EditText) findViewById(R.id.tvusuario);
		// get name as string
		String nombreusuario = nombreusuarioEditText.getText().toString();

		// edit text for email field
		EditText passEditText = (EditText) findViewById(R.id.tvpassword);
		// get email as string
		String pass = passEditText.getText().toString();

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
