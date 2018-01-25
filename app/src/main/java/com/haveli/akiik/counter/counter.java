package com.haveli.akiik.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class counter extends AppCompatActivity {

    Button bui,bud;
    TextView tv;
int res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tv = findViewById(R.id.count);
        bud=findViewById(R.id.dec);
        bui=findViewById(R.id.inc);
        bud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(res==0){
                    res=0;}
              else {
                    res--;
                }
                tv.setText(""+res);
            }
        });
            bui.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    res++;
                    tv.setText(""+res);
                }
            });
    }
}