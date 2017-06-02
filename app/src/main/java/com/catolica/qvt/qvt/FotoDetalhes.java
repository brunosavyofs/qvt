package com.catolica.qvt.qvt;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FotoDetalhes extends AppCompatActivity {

    private Button botaoCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_detalhes);
        //altera a cor do titulo do topo
        Toolbar actionBarToolbar = (Toolbar)findViewById(R.id.action_bar);
        if (actionBarToolbar != null) {
            actionBarToolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorQVT));
        }

        botaoCancelar = (Button)findViewById(R.id.cancelar);
        botaoCancelar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotoDetalhes.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

    }
}
