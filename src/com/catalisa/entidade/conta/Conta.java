package com.catalisa.entidade.conta;

import java.util.Calendar;

public class Conta {

    private double diaRendimento;
    private double saldo;

    public Conta(){

    }
    public Conta(double diaRendimento, double saldo) {
        this.diaRendimento = diaRendimento;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "\nrendimento do dia: " + diaRendimento +
                " \nsaldo: " + saldo;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
