package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {

    private int cangaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cangaHoraria;
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cangaHoraria=" + cangaHoraria +
                '}';
    }

}
