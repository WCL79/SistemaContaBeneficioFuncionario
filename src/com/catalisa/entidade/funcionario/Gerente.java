package com.catalisa.entidade.funcionario;

import com.catalisa.entidade.conta.ContaEspecial;

public class Gerente extends Funcionario{

    ContaEspecial contaEspecial;

    public ContaEspecial getContaEspecial() {
        return contaEspecial;
    }

    public Gerente(ContaEspecial contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public Gerente(String nome, Integer id, String cargo, Double salario, ContaEspecial contaEspecial) {
        super(nome, id, cargo, salario);
        this.contaEspecial = contaEspecial;
    }

    @Override
    public String toString() {
        return super.toString()+" \nGerente: " +
                                " contém acesso conta especial!" + contaEspecial;
    }
}
