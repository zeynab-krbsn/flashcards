package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

        s1=getResources().getStringArray(R.array.word);
        s2=getResources().getStringArray(R.array.description);


        Adapter adapter = new Adapter(this,s1,s2);
        //recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


        TextView textViewLevel =findViewById(R.id.textViewLevel);
        String level=null;
        String level2=null;
        Bundle bundle=getIntent().getExtras();
        if (bundle != null) {
//            level=bundle.get("g").toString();
//            level2=bundle.get("ch").toString();
            level=bundle.get("level").toString();
        }
        textViewLevel.setText(level);
        if (textViewLevel.getText().equals("دانش فنی پایه "))
        {
            recyclerView.setAdapter(adapter);

        }
        else
        {

        }
    }
}