package com.example.ch4practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        marks=findViewById(R.id.marks);
        Intent intent=getIntent();
        int score=intent.getIntExtra(MainActivity.EXTRA_NAME,0);
        int t=intent.getIntExtra(MainActivity.EXTRA_T, 0);
        marks.setText("Your score is "+score+"/"+t);
    }
}