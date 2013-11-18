package com.catedra2android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;



public class AplicacionActivity extends Activity {
	
	public final static String USER_VALUE = "com.catedra2android.USER_VALUE";
	public final static String PASSWORD_VALUE = "com.catedra2android.PASSWORD_VALUE";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aplicacion);
		Intent intent = new Intent(this, RegistroActivity.class);
	    
	    
	    startActivity(intent);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aplicacion, menu);
		return true;
	}
	
public void addPerfil(View view) { 
		
		Intent i = new Intent(this,PerfilActivity.class);
		startActivity(i);

}

public void addFuera(View view) { 
	
	Intent i = new Intent(this,LoginActivity.class);
	startActivity(i);

}

public void addSettings(View view) { 
	
	Intent i = new Intent(this,AjustesActivity.class);
	startActivity(i);

}


    
}
