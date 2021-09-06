package com.example.ch4practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME="com.example.ch4practise.extra.NAME";
    public static final  String EXTRA_T="com.example.ch4practise.extra.T";

    private String []questions={"Java is platform independent language", "Java was introduced in 1223","Java has abstract classes",
    "Java supports interface","Java was created using Python language"};
    private boolean[] answers={true,false,true,true,false};
    public int score=0;
    Button Y,N,button;
    TextView ques;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Y=findViewById(R.id.Y);
        N=findViewById(R.id.N);
        button=findViewById(R.id.button);
        ques=findViewById(R.id.ques);
        ques.setText(questions[index]);
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length - 1) {
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        ques.setText(questions[index]);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length - 1) {
                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        ques.setText(questions[index]);
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(EXTRA_NAME,score);
                intent.putExtra(EXTRA_T,questions.length);
                startActivity(intent);
            }
        });
    }
}