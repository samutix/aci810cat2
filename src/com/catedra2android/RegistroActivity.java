package com.catedra2android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;


public class RegistroActivity extends Activity {
	
	public final static String USER_VALUE = "com.catedra2android.USER_VALUE";
	public final static String PASSWORD_VALUE = "com.catedra2android.PASSWORD_VALUE";
	public final static String CORREO_VALUE = "com.catedra2android.CORREO_VALUE";
    public final static String TELEFONO_VALUE ="com.catedra2android.RUT_VALUE";
    public final static String RADIOBUTTON01_VALUE ="com.catedra2android.RADIOBUTTON01_VALUE";
    public final static String RADIOBUTTON02_VALUE ="com.catedra2android.RADIOBUTTON02_VALUE";
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registro);
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registro, menu);
		return true;
	}
	
	public void agregar(View view) { 
		
		Intent i = new Intent(this,AplicacionActivity.class);
		
		
		EditText EditNombre = (EditText) findViewById(R.id.registerName);
		String name = EditNombre.getText().toString();
		
		EditText EditPass = (EditText) findViewById(R.id.registerPass);
		String pass = EditPass.getText().toString();
		
		EditText EditCorreo = (EditText) findViewById(R.id.registerCorreo);
		String correo = EditCorreo.getText().toString();
		
		
		EditText EditTelefono= (EditText) findViewById(R.id.registerTelefono);
		String telefono =EditTelefono.getText().toString();
		
		RadioButton Rb1 = (RadioButton) findViewById(R.id.radioRegister1);
		Boolean r1 = Rb1.isChecked();
		
		RadioButton Rb2 = (RadioButton) findViewById(R.id.radioRegister2);
		Boolean r2 = Rb2.isChecked();
		
	
		SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("me", Context.MODE_PRIVATE);  
		
		
		
		SharedPreferences.Editor editor = sharedPref.edit();   
		
		
		
		editor.putString(USER_VALUE, name);        
		editor.putString(PASSWORD_VALUE, pass);
		editor.putString(CORREO_VALUE, correo);
		editor.putString(TELEFONO_VALUE, telefono);
		editor.putBoolean(RADIOBUTTON01_VALUE, r1);
		editor.putBoolean(RADIOBUTTON02_VALUE, r2);
		
		editor.commit();
		
		startActivity(i);
}
}
