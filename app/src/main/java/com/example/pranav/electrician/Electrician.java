package com.example.pranav.electrician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Electrician extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);
        button=(Button)findViewById(R.id.car);
        button.setOnClickListener(this);
    }

    private void pop2() {
        Intent intent=new Intent(this,Electrician1.class);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
        pop2();

    }
}
