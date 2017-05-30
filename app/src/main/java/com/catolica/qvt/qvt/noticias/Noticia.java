package com.catolica.qvt.qvt.noticias;

/**
 * Created by bruno on 29/05/17.
 */
public class Noticia {
    private String titulo;
    private String texto;

    public Noticia(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return titulo + " - " + texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }
}