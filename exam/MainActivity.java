package com.example.optionfa;




import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent i = new Intent();
        switch (item.getItemId()) {
            case (R.id.opt1):
                i.setClass(this,MainActivity2.class);
                startActivity(i);
                return true;

            case (R.id.opt2):
                i.setClass(this,MainActivity3.class);
                startActivity(i);
                return true;
        }
        return true;

    }
}