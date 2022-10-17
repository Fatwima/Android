package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BT1 = findViewById(R.id.button1);
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change();
            }
        });
    }

    public void change(){
        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("name","Fathima");
        i.putExtra("initial","Kakkattummal");
        startActivity(i);
    }
}

