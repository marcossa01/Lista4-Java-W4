package com.company.domain;

import java.time.LocalDate;

public class Estudante {
    private String nome;
    private LocalDate dataDeNascimento;
    private int numeroMatricula;

    private Turma turma;

    public Estudante(){
    }

    public Estudante(String nome, LocalDate dataDeNascimento, int numeroMatricula, Turma turma) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroMatricula = numeroMatricula;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
