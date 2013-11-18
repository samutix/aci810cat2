package com.catedra2android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	public final static String USER_VALUE = "com.catedra2android.USER_VALUE";
	public final static String PASSWORD_VALUE = "com.catedra2android.PASSWORD_VALUE";
	private String name;
	private String pass;
	

	private Button Login;
	private EditText nText, pText;
	SharedPreferences sharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("me", Context.MODE_PRIVATE);   
	
		 name  = sharedPreferences.getString(USER_VALUE,"");
	      pass = sharedPreferences.getString(PASSWORD_VALUE,"");
	
	      nText = (EditText) findViewById(R.id.editnameLog);
	      pText = (EditText) findViewById(R.id.editpassLog);
	 
	      Login = (Button) findViewById(R.id.iniciarLogin);
	      
	      Login.setOnClickListener(new View.OnClickListener(){
	    	  
	          public void onClick(View view){	 
	          if(enterCorrecto()){
	             Toast toast1 = Toast.makeText(getApplicationContext(),"User/pass correctos", Toast.LENGTH_SHORT);
	             toast1.show();
	             Intent i = new Intent(LoginActivity.this,AplicacionActivity.class);
	             startActivity(i);
	          }else{
	             Toast toast1 = Toast.makeText(getApplicationContext(),"User/pass incorrectos", Toast.LENGTH_SHORT);
	             toast1.show();
	          }
	        
	        }

			private boolean enterCorrecto()  {
			boolean ok = false;
		      String n, p;
		      
		      n = nText.getText().toString();
		      p = pText.getText().toString();
		      Log.d("onlclick",n + " " + p);
		      Log.d("onlclick",name + " " + pass);
		      if((name != "")&&(pass != "")&&(n.equals(name)&&p.equals(pass))){
		         ok = true;
		      }
		      return ok;
		    }
	     });
	      
	    
	
	
	
	}
	
}



