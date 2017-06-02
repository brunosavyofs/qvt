package com.catolica.qvt.qvt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TelaComentario extends AppCompatActivity {

    private Button botaoCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario);
        //altera a cor do titulo do topo
        Toolbar actionBarToolbar = (Toolbar)findViewById(R.id.action_bar);
        if (actionBarToolbar != null) {
            //altera a cor do titulo do topo
            actionBarToolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorQVT));
            actionBarToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        }

        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //mudar a seta
        //getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);


        botaoCancelar = (Button)findViewById(R.id.cancelar);
        botaoCancelar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaComentario.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

    }
}
