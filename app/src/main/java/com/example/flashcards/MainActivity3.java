package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView thirdWord,thirdWordDescription;
    ImageButton arrow_back;
    String data1,data2;
    //MContext context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        thirdWord = findViewById(R.id.textViewWord);
        thirdWordDescription = findViewById(R.id.textViewWordDescription);
        arrow_back = findViewById(R.id.arrow_back);

        getData();
        setData();


        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity3.this , MainActivity2.class);
                startActivity(intent3);
            }
        });


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
