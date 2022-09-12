package com.example.contador;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button botao = (Button)findViewById(R.id.button);

    botao.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            contador++;
            TextView texto = findViewById(R.id.textView);
            texto.setText(""+contador);
        }
    });  
    }
}