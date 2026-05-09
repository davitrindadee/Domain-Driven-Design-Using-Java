package br.com.fiap.portalgeral.model;

import br.com.fiap.portalgeral.model.Pessoa;

public class Professor extends Pessoa {


    private String materia;
    private double salario;

    public Professor() {
    }


    public Professor(String nome, String cpf, int idade, String materia, double salario) {
        super(nome, cpf, idade);
        this.materia = materia;
        this.salario = salario;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}