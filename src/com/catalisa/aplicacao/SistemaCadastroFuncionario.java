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
               EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO, LIMITE e SALDO: ");
               String nome = EntradaSaida.criarScanner().nextLine();
               int id =  EntradaSaida.criarScanner().nextInt();
               String cargo = EntradaSaida.criarScanner().nextLine();
               double salario =  EntradaSaida.criarScanner().nextDouble();

               double limite = EntradaSaida.criarScanner().nextDouble();
               double saldo = EntradaSaida.criarScanner().nextDouble();

               ContaEspecial contaEspecial = new ContaEspecial(limite, saldo);
               contaEspecial.setInvestimentoDiferenciado(0.075, salario);

               Gerente gerente = ServicoFuncionario.cadastrarGerente(nome, id, cargo,salario,contaEspecial);

               EntradaSaida.mostrarTexto(gerente.toString());

            } else if (resposta == 2) {
                EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO, TAXA DO DIA EM % e SALDO: ");
                Operacional operacional = ServicoFuncionario.cadastrarOperacional(
                        EntradaSaida.criarScanner().nextLine(),
                        EntradaSaida.criarScanner().nextInt(),
                        EntradaSaida.criarScanner().nextLine(),
                        EntradaSaida.criarScanner().nextDouble(),
                        new Conta(EntradaSaida.criarScanner().nextDouble(),
                                  EntradaSaida.criarScanner().nextDouble()));
                                  EntradaSaida.mostrarTexto(operacional.toString());
            } else if (resposta == 3) {
                EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO: ");
                Vendedor vendedor = ServicoFuncionario.cadastrarVendedor(
                        EntradaSaida.criarScanner().nextLine(),
                        EntradaSaida.criarScanner().nextInt(),
                        EntradaSaida.criarScanner().nextLine(),
                        EntradaSaida.criarScanner().nextDouble());
                EntradaSaida.mostrarTexto(vendedor.toString());
            }
        }
    }
}
