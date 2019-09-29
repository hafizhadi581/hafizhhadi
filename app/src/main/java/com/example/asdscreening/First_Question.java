package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class First_Question extends AppCompatActivity {

    ImageView btn2q11;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        btn2q11 = findViewById(R.id.btnq11);
        btn2q11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(First_Question.this,Second_Question.class);
                startActivity(intent);
            }
        });
    }
}
