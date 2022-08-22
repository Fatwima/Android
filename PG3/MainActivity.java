//Implementing basic arithmetic operations of a simple calculator
package com.example.calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1,btn2,btn3,btn4;

        EditText t1=(EditText)findViewById(R.id.editText1);
        EditText t2=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        TextView tv1=findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x+y;
                tv1.setText(Float.toString(z));
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x-y;
                tv1.setText(Float.toString(z));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x*y;
                tv1.setText(Float.toString(z));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x/y;
                tv1.setText(Float.toString(z));
            }
        });
    }
}