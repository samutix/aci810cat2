package com.catedra2android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;



public class PerfilActivity extends Activity {

	public final static String USER_VALUE = "com.catedra2android.USER_VALUE";
	public final static String PASSWORD_VALUE = "com.catedra2android.PASSWORD_VALUE";
	public final static String CORREO_VALUE = "com.catedra2android.CORREO_VALUE";
    public final static String TELEFONO_VALUE ="com.catedra2android.RUT_VALUE";
    public final static String RADIOBUTTON01_VALUE ="com.catedra2android.RADIOBUTTON01_VALUE";
    public final static String RADIOBUTTON02_VALUE ="com.catedra2android.RADIOBUTTON02_VALUE";
    

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfil);
	
		 SharedPreferences sharedPref = getSharedPreferences("me", Context.MODE_PRIVATE);        
	     
	     String name = sharedPref.getString(RegistroActivity.USER_VALUE, "");        
	     String correo = sharedPref.getString(RegistroActivity.PASSWORD_VALUE, "");
	     String pass= sharedPref.getString(RegistroActivity.CORREO_VALUE, "");
	     String  rut = sharedPref.getString(RegistroActivity.TELEFONO_VALUE, "");
	     Boolean  r1 = (Boolean) sharedPref.getBoolean(RegistroActivity.RADIOBUTTON01_VALUE, true);
	     Boolean r2 = (Boolean) sharedPref.getBoolean(RegistroActivity.RADIOBUTTON02_VALUE, true);
	  
	     EditText nameTextView = (EditText) findViewById(R.id.profileName);
	     nameTextView.setText(name);
	     
	     EditText correoTextView = (EditText) findViewById(R.id.profileCorreo);
	     correoTextView.setText(correo);

	     EditText passTextView = (EditText) findViewById(R.id.profilePass);
	     passTextView.setText(pass);
	     
	     EditText rutTextView = (EditText) findViewById(R.id.profileTelefono);
	     rutTextView.setText(rut);

	     
	     RadioButton radiobutton01  = (RadioButton) findViewById(R.id.radioButtonprofile1);
	     radiobutton01.setChecked(r1);
	     

	     RadioButton radiobutton02  = (RadioButton) findViewById(R.id.radioButtonprofile2);
	     radiobutton02.setChecked(r2);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.perfil, menu);
		return true;
	}
	 @Override
     public boolean onOptionsItemSelected(MenuItem item) {
             switch (item.getItemId()) {
             case android.R.id.home:
                     
                     NavUtils.navigateUpFromSameTask(this);
                     return true;
             }
             return super.onOptionsItemSelected(item);
     }
	 public void savePerfil(View view) { 
			
			
		    EditText EditNombre = (EditText) findViewById(R.id.profileName);
			String name = EditNombre.getText().toString();
			
			EditText EditPass = (EditText) findViewById(R.id.profilePass);
			String pass = EditPass.getText().toString();
			
			EditText EditCorreo = (EditText) findViewById(R.id.profileCorreo);
			String correo = EditCorreo.getText().toString();
			
			
			EditText EditTelefono = (EditText) findViewById(R.id.profileTelefono);
			String telefono =EditTelefono.getText().toString();
			
			RadioButton Rb1 = (RadioButton) findViewById(R.id.radioButtonprofile1);
			Boolean r1 = Rb1.isChecked();
			
			RadioButton Rb2 = (RadioButton) findViewById(R.id.radioButtonprofile2);
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
	
			
			

			
				
				
			
			}
		
	}