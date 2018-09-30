package com.example.pranav.electrician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class electrician2 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician2);
        button=(Button) findViewById(R.id.o16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop4();
            }
        });
    }

    private void pop4() {
        Intent intent=new Intent(this,Electrician1.class);
        startActivity(intent);
    }
}
