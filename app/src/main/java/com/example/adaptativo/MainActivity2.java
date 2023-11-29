package com.example.adaptativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //declara variables

        Button btn2 = findViewById(R.id.button2);

        //escuchar boton

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //generamos inten
                Intent irA1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(irA1);

            }
        });
    }
}