package com.catalisa.entidade.conta;

public class ContaEspecial {

    private double limite;
    private double saldo;
    private double investimentoDiferenciado;

    public ContaEspecial(){

    }
    public ContaEspecial(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public double getInvestimentoDiferenciado() {
        return investimentoDiferenciado;
    }

    public void setInvestimentoDiferenciado(double investimentoDiferenciado, double salario) {
        this.investimentoDiferenciado = (investimentoDiferenciado * salario) + salario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return " \nConta especial: " +
                "\nlimite: " + limite +
                "\nsaldo: " + saldo +
                "\ninvetimento: " + investimentoDiferenciado;
    }

        public boolean sacar(double valor){

            double saldoComLimite = this.getSaldo() + limite;

            if ((saldoComLimite-valor) >=0){
                this.setSaldo(this.getSaldo()-valor);
                return true;
            }
            return false;
        }
}
