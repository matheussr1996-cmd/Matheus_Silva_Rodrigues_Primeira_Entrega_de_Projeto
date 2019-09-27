package com.example.primeira_entrega_de_projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Album extends AppCompatActivity {
    private Button buttonText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        buttonText2= findViewById(R.id.buttonPicture2);
        buttonText2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Album.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
