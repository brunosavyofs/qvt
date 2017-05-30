package com.catolica.qvt.qvt.noticias;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.catolica.qvt.qvt.R;
import com.catolica.qvt.qvt.noticias.Noticia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 29/05/17.
 */

public class NoticiasFragment extends Fragment {

    ListView listaNoticias;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.noticias_fragment, container, false);
        listaNoticias = (ListView) rootView.findViewById(R.id.listaNoticias);

        AdapterNoticia adapter = new AdapterNoticia(getNoticias(), getActivity(), R.layout.lista_noticias, R.id.titulo_noticia, R.id.texto_noticia);
        listaNoticias.setAdapter(adapter);

        return rootView;
    }

    public List<Noticia> getNoticias() {
        ArrayList<Noticia> noticias = new ArrayList<Noticia>();
        noticias.add(new Noticia("Ladrões são presos após tentar roubar casa pela segunda vez no mesmo dia",
                "Na primeira tentativa eles entraram em luta corporal com vítima e saíram sem nada. Na segunda vez, até levaram uma televisão, mas acabaram sendo presos na fuga."));
        noticias.add(new Noticia("Bairros de Guaraí podem ficar sem água durante obras; veja lista",
                "Cerca de 13 mil moradores podem ser afetados. Obras em novo reservatório devem durar quatro dias."));
        noticias.add(new Noticia("Homens invadem delegacia em Palmas e furtam motocicletas apreendidas",
                "Veículos foram furtados do pátio de delegacia no Jardim Aureny III, na região sul da capital, mas já foram recuperados. Caso está sendo investigado pela Polícia Civil."));
        noticias.add(new Noticia("Focos de queimadas aumentam e Tocantins fica em 2º lugar no ranking brasileiro",
                "De janeiro até este domingo (28) foram registrados 871 focos em todo o estado. Comandante dos Bombeiros disse que o período que vai de maio a novembro é o mais crítico."));
        return noticias;
    }
}
