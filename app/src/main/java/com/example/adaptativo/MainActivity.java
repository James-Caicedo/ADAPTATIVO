package com.example.adaptativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //declara variables

        Button btn1 = findViewById(R.id.button);

        //escuchar boton

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //generamos inten
                Intent irA2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(irA2);

            }
        });
    }
}