package com.catalisa.aplicacao.tela;

import com.catalisa.aplicacao.EntradaSaida;
import com.catalisa.entidade.conta.Conta;
import com.catalisa.entidade.funcionario.Operacional;
import com.catalisa.servico.ServicoFuncionario;

public class TelaDois implements TelaStrategy {
    @Override
    public void mostrarTela() {
        EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO, TAXA DO DIA EM % e SALDO: ");
        Operacional operacional = ServicoFuncionario.cadastrarOperacional(
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextInt(),
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextDouble(),
                new Conta(EntradaSaida.criarScanner().nextDouble(),
                        EntradaSaida.criarScanner().nextDouble()));
        EntradaSaida.mostrarTexto(operacional.toString());
    }
}
