package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso {
    private String titulo;
    private String descricao;
    private int cangaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCangaHoraria() {
        return cangaHoraria;
    }

    public void setCangaHoraria(int cangaHoraria) {
        this.cangaHoraria = cangaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cangaHoraria=" + cangaHoraria +
                '}';
    }
}
