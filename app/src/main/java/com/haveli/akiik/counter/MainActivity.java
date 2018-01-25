package com.haveli.akiik.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bu = findViewById(R.id.bmain);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conect = new Intent(getApplicationContext(), counter.class);
                startActivity(conect);
            }
        });

    }
}