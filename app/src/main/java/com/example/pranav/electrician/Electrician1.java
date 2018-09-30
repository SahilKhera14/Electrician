package com.example.pranav.electrician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class Electrician1 extends AppCompatActivity {
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician1);
        radioButton=(RadioButton) findViewById(R.id.a2);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop3();
            }

        });

    }


    private void pop3() {
        Intent intent=new Intent(this,Electrician1.class);
        startActivity(intent);


    }
}
