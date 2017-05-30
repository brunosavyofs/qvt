package com.catolica.qvt.qvt.noticias;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bruno on 29/05/17.
 */

public class AdapterNoticia extends BaseAdapter {
    private final List<Noticia> noticias;
    private final Activity act;
    private int layoutResourceId;
    private int idTituloNoticia;
    private int idTextoNoticia;

    public AdapterNoticia(List<Noticia> noticias, Activity act, int layoutResourceId, int idTituloNoticia, int idTextoNoticia) {
        this.noticias = noticias;
        this.act = act;
        this.layoutResourceId = layoutResourceId;
        this.idTituloNoticia = idTituloNoticia;
        this.idTextoNoticia = idTextoNoticia;
    }

    @Override
    public int getCount() {
        return noticias.size();
    }

    @Override
    public Object getItem(int position) {
        return noticias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(this.layoutResourceId, parent, false);

        Noticia noticia = noticias.get(position);

        TextView titulo = (TextView) view.findViewById(this.idTituloNoticia);
        titulo.setText(noticia.getTitulo());
        TextView texto = (TextView) view.findViewById(this.idTextoNoticia);
        texto.setText(noticia.getTexto());

        return view;
    }
}
