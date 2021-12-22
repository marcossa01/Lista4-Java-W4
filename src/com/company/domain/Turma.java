package com.company.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    private int codigo;

    private List<Estudante> estudantes = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Turma() {
    }

    public Turma(String serie, int codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
