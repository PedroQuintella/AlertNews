package com.bonatti.alertnews.model.entity;

public class Noticia {

    private Integer codigo;
    private String titulo;
    private String resumo;
    private String texto;
    private String autor;
    private String hora;
    private String data;

    public Noticia(Integer codigo, String titulo, String resumo, String texto, String autor, String hora, String data) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.texto = texto;
        this.autor = autor;
        this.hora = hora;
        this.data = data;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}