package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[] ,s2[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.pizza_name);
        s2=getResources().getStringArray(R.array.pizza_description);


        MyAdapter myAdapter = new MyAdapter(this,s1,s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        TextView textViewLevel =findViewById(R.id.textViewLevel);
        String level=null;
        Bundle bundle=getIntent().getExtras();
        if (bundle != null) {
            level=bundle.getString("level");
        }
        textViewLevel.setText(level);
    }
}