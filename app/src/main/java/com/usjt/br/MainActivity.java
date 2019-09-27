package com.usjt.br;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "enviarMensagem";


    //private EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
    public void Enviar_Menssagem(View View){
        Intent intent = new Intent(this, Activity2.class);
        EditText editText = (EditText) findViewById(R.id. texto );
        String message = editText.getText().toString();
        intent.putExtra( EXTRA_MESSAGE , message);
        startActivity(intent);
    }
}
