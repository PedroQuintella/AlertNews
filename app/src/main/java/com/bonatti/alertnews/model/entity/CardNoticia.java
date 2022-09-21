package com.bonatti.alertnews.model.entity;

public class CardNoticia {

    private Integer codigo;
    private String titulo;
    private String resumo;
    private String hora;

    public CardNoticia(Integer codigo, String titulo, String resumo, String hora) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.hora = hora;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
