package com.catalisa.aplicacao;

import com.catalisa.entidade.conta.Conta;
import com.catalisa.entidade.conta.ContaCartaoCredito;
import com.catalisa.entidade.conta.ContaEspecial;
import com.catalisa.entidade.funcionario.Gerente;
import com.catalisa.entidade.funcionario.Operacional;
import com.catalisa.entidade.funcionario.Vendedor;
import com.catalisa.servico.ServicoFuncionario;

public class SistemaCadastroFuncionario {

    public static void menu(){

        StringBuilder model = new StringBuilder();
        model.append("Digite:\n");
        model.append(" 0 Para do SAIR do Sistema:\n ");
        model.append(" 1 Para cadatrar Funcionário Gerente:\n ");
        model.append(" 2 Para cadastrar Funcionário Operacional:\n ");
        model.append(" 3 Para cadatrar Funcionário Vendedor:\n ");
        System.out.println(model.toString());
    }
    public void executarSistema() {
        boolean controle = true;
        menu();
        while (controle) {
            int resposta = EntradaSaida.criarScanner().nextInt();
            if (resposta == 1) {

            } else if (resposta == 2) {

            } else if (resposta == 3) {

            }
        }
    }
}
