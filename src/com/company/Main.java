package com.company;

import com.company.domain.Disciplina;
import com.company.domain.Estudante;
import com.company.domain.Turma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /* Você precisa entregar um sistema para gerenciamento de turmas em uma determinada
    escola.

    1. Para isso você deverá desenvolver uma classe Turma que deve ter a série e o
    código identificador (8o ano A, 9o ano C, etc...), um vetor de disciplinas e um
    vetor de estudantes.

    2. Crie a classe Disciplina que deve ter o nome e a carga horária

    3. Crie a classe Estudante que deverá receber um nome, data de nascimento,
    número de matrícula e série.

    Por fim, você deverá criar uma classe principal para criar alguns estudantes e
    disciplinas e, em seguida, criar algumas turmas e inserir os estudantes e disciplinas já
    criados nessas turmas. */

    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Português", 120);
        Disciplina d2 = new Disciplina("Matemática", 120);
        Disciplina d3 = new Disciplina("Geografia", 120);
        Disciplina d4 = new Disciplina("Artes", 60);

        Turma t1 = new Turma("8 ano A", 1);
        Turma t2 = new Turma("9 ano B", 2);

        t1.getDisciplinas().addAll(Arrays.asList(d1, d2, d4));
        t2.getDisciplinas().addAll(Arrays.asList(d1, d2, d3, d4));

        Estudante e1 = new Estudante("Marcos Vincius", LocalDate.parse("2000-09-16"), 1230, t1);
        Estudante e2 = new Estudante("Leonardo Victor", LocalDate.parse("1998-02-18"), 1235, t2);
        Estudante e3 = new Estudante("Arthur Gabriel", LocalDate.parse("2005-05-15"), 1243, t1);
        Estudante e4 = new Estudante("Maria Fernanda", LocalDate.parse("1997-02-12"), 1239, t2);

        List<Estudante> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        for(Estudante e : list) {
            System.out.println(
                    "Nome do Aluno: " + e.getNome()
                    + ", Data de Nascimento: " + e.getDataDeNascimento()
                    + ", Matrícula: " + e.getNumeroMatricula()
                    + ", Turma: " + e.getTurma().getSerie()
            );
            System.out.println();
        }
    }
}
