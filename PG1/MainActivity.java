package com.example.loginn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,pass;
    Button login;
    Toast to1 , to2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
        login = (Button) findViewById(R.id.button);

    }
        public void login(View  view) {

            String name = uname.getText().toString();
            String pwd = pass.getText().toString();


               if( name.equals("fathima") && pwd.equals("1234")){

                 to1=Toast.makeText(this, "LOGIN SUCCESS", Toast.LENGTH_LONG);
                 to1.show();
               }else{
                   to2=Toast.makeText(this, "INVALID", Toast.LENGTH_LONG);
                   to2.show();
                }
    }
}