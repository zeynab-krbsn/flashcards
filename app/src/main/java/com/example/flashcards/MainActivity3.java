package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView thirdWord,thirdWordDescription;

    String data1,data2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        thirdWord = findViewById(R.id.textViewWord);
        thirdWordDescription = findViewById(R.id.textViewWordDescription);

        getData();
        setData();



    }
    private void getData(){
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");

        }else {
            Toast.makeText(this,"no data",Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        thirdWord.setText(data1);
        thirdWordDescription.setText(data2);

    }

    }
