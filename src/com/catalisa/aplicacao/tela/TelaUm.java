package com.catalisa.aplicacao.tela;

import com.catalisa.aplicacao.EntradaSaida;
import com.catalisa.entidade.conta.ContaEspecial;
import com.catalisa.entidade.funcionario.Gerente;
import com.catalisa.servico.ServicoFuncionario;

public class TelaUm implements TelaStrategy {


    @Override
    public void mostrarTela() {
        EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO, LIMITE e SALDO: ");
        EntradaSaida.mostrarTexto(cadastrarGerente(
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextInt(),
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextDouble(),
                EntradaSaida.criarScanner().nextDouble(),
                EntradaSaida.criarScanner().nextDouble()
        ).toString());
    }

    private Gerente cadastrarGerente(String nome, int id, String cargo, double salario, double limite, double saldo) {
        ContaEspecial contaEspecial = new ContaEspecial(limite, saldo);
        contaEspecial.setInvestimentoDiferenciado(0.075, salario);
        return ServicoFuncionario.cadastrarGerente(nome, id, cargo,salario,contaEspecial);
    }
}
