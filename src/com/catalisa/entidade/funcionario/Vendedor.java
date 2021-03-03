package com.catalisa.entidade.funcionario;

import com.catalisa.entidade.conta.ContaCartaoCredito;

public class Vendedor extends Funcionario{

    private ContaCartaoCredito contaCartaoCredito;

    public Vendedor(String nome, Integer id, String cargo, Double salario) {
        super(nome, id, cargo, salario);
    }

    public ContaCartaoCredito getContaCartaoCredito() {
        return contaCartaoCredito;
    }

    public void setContaCartaoCredito(ContaCartaoCredito contaCartaoCredito) {
        this.contaCartaoCredito = contaCartaoCredito;
    }
    @Override
    public String toString() {
        return " Vendedor: " +
                "limite crédito para despesa: " + contaCartaoCredito
                +super.toString();
    }
}
