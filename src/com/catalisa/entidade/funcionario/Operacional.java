package com.catalisa.entidade.funcionario;

import com.catalisa.entidade.conta.Conta;

public class Operacional extends Funcionario{

    Conta conta;

    public Operacional(Conta conta) {
        this.conta = conta;
    }

    public Operacional(String nome, Integer id, String cargo, Double salario, Conta conta) {
        super(nome, id, cargo, salario);
        this.conta = conta;
    }

    @Override
    public String toString() {
        return super.toString()+"\nConta salário operacional: " +
                                "\nconta salário de investimento simples: " + conta;
    }
}
