package com.catalisa.entidade.conta;

import com.catalisa.entidade.funcionario.Gerente;

public class ContaCartaoCredito {

    private double valorOperacional;

    public boolean CompraCartaoCredito(Double valorCompra, Gerente gerente){

        if(valorOperacional < valorCompra){
            System.out.println("Saldo insuficiente!");
            return false;
        }
        if(gerente.getContaEspecial().getSaldo() < valorCompra){
            System.out.println("SALDO DO GERENTE INSUFICIENTE!");
            return false;
        }
        double saldoAtualizadoGerente = gerente.getContaEspecial().getSaldo() - valorCompra;
        gerente.getContaEspecial().setSaldo(saldoAtualizadoGerente);
        System.out.println("Compra permitida, saldo atualizado do gerente:  "+saldoAtualizadoGerente);
        return true;
    }
    public ContaCartaoCredito(double valorOperacional) {
        this.valorOperacional = valorOperacional;
    }

    public double getValorOperacional() {
        return valorOperacional;
    }

    public void setValorOperacional(double valorOperacional) {
        this.valorOperacional = valorOperacional;
    }

    @Override
    public String toString() {
        return "Conta Credito: " +
                "\ncrédito para despesas " + valorOperacional;
    }
}
