package com.catolica.qvt.qvt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaComentario extends AppCompatActivity {

    private Button botaoCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario);

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
