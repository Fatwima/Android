package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String [] name={"BLUE","RED","WHITE","BLACK","PINK"};
    String [] index={"0","1","2","3","4","5","6"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list=findViewById(R.id.list);
        ArrayAdapter<String> arr = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,index);
        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try{
                    Toast.makeText(MainActivity.this,name[(i)],Toast.LENGTH_SHORT).show();
                }catch(ArrayIndexOutOfBoundsException e){
                    Toast.makeText(MainActivity.this,"Array out of bound \nMinimum index\n"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}