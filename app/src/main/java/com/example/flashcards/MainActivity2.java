package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewLevel =findViewById(R.id.textViewLevel);
        String level=null;
        Bundle bundle=getIntent().getExtras();
        if (bundle != null) {
            level=bundle.getString("level");
        }
        textViewLevel.setText(level);
    }
}