package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;





public class MainActivity extends Activity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


       /* RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);

        myLayout.setBackgroundColor(Color.WHITE);
        myButton.setBackgroundColor(Color.GREEN);
        myButton.setText("Login");

        RelativeLayout.LayoutParams buttonDetails=
          new   RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
          );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        myLayout.addView(myButton,buttonDetails);

      EditText username = new EditText(this);
      myButton.setId(1);
      username.setId(2);
        RelativeLayout.LayoutParams usernameDetails=
                new    RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        usernameDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);


        Resources r=getResources();
       int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,r.getDisplayMetrics());
       username.setWidth(px);

        usernameDetails.setMargins(0,0,0,50);
        myLayout.addView(username,usernameDetails);
        setContentView(myLayout);

        EditText password = new EditText(this);
        password.setId(3);
        RelativeLayout.LayoutParams passwordDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        passwordDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        passwordDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        Resources r1=getResources();
        int px1 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,r.getDisplayMetrics());
        password.setWidth(px);

        passwordDetails.setMargins(0,0,0,200);
        myLayout.addView(password,passwordDetails);
        setContentView(myLayout);*/


       public void Register(View v)
       {
            Intent i_register=new Intent(MainActivity.this,Register.class);
            startActivity(i_register);

        }

        public void Display(View v)
        {
            Intent i_view=new Intent(MainActivity.this,Display.class);
            startActivity(i_view);

        }

        public void Instructions(View v)
        {
            Intent i_help=new Intent(MainActivity.this,Instructions.class);
            startActivity(i_help);
        }

        public void Verify(View v)
        {
            Intent i_verify=new Intent(MainActivity.this,Verify.class);
            startActivity(i_verify);
        }


    }

