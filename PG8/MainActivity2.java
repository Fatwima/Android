package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tview = findViewById(R.id.textView);
        Bundle Extra = getIntent().getExtras();
        String name = Extra.getString("name");
        String iniitial = Extra.getString("initial");
        tview.setText(name+"\n"+iniitial);
    }
}