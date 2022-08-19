package com.example.pg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MY_Tag", "onCreate");
        Toast.makeText(this, "Activity Created", Toast.LENGTH_SHORT).show();

        Button b1;
        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bttnclick();
            }
        });
    }

    private void bttnclick() {
        Intent in = new Intent(this,MainActivity2.class);
        startActivity(in);
    }


    protected void onStart() {
        super.onStart();
        Log.i("MY_Tag", "onStart");
        Toast.makeText(this, "Activity Started", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MY_Tag", "onResume");
        Toast.makeText(this, "Activity Resumed", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MY_Tag", "onPause");
        Toast.makeText(this, "Activity Paused", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MY_Tag", "onRestart");
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MY_Tag", "onStop");
        Toast.makeText(this, "Activity Stopped", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MY_Tag", "onDestroy");
        Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_LONG).show();



    }
}