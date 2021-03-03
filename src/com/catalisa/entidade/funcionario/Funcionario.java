package com.catalisa.entidade.funcionario;

public class Funcionario {

    private String nome;
    private Integer Id;
    private String cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionario(){

    }
    public Funcionario(String nome, Integer id, String cargo, Double salario) {
        this.nome = nome;
        Id = id;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Funcionario: " +
                "   \nNome: " + nome +
                "   \nId:" + Id +
                "   \nCargo:" + cargo  +
                "   \nSalário:" + salario;
    }
}


