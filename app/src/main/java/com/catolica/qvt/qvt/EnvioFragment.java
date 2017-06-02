package com.catolica.qvt.qvt;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by bruno on 28/05/17.
 */

public class EnvioFragment extends Fragment {

    private Button botaoFoto;
    private Button botaoComentarios;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.envio_fragment, container, false);

        botaoFoto = (Button)rootView.findViewById(R.id.btnFoto);
        botaoFoto.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FotoDetalhes.class);
                startActivity(intent);
            }
        });

        botaoComentarios = (Button)rootView.findViewById(R.id.btnComentario);
        botaoComentarios.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TelaComentario.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

}
