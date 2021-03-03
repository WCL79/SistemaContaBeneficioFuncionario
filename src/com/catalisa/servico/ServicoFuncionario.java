package com.catalisa.servico;

import com.catalisa.entidade.conta.Conta;
import com.catalisa.entidade.conta.ContaCartaoCredito;
import com.catalisa.entidade.conta.ContaEspecial;
import com.catalisa.entidade.funcionario.Funcionario;
import com.catalisa.entidade.funcionario.Gerente;
import com.catalisa.entidade.funcionario.Operacional;
import com.catalisa.entidade.funcionario.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ServicoFuncionario {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarFuncionario(String nome, Integer id, String cargo, Double salario){
        funcionarios.add(new Funcionario( nome, id, cargo, salario));
    }
    public static Gerente cadastrarGerente(String nome, Integer id, String cargo, Double salario,
                                        ContaEspecial contaEspecial){
        Gerente gerente = new Gerente(nome,id,cargo,salario, contaEspecial);
        funcionarios.add(gerente);
        return gerente;
    }
    public static Operacional cadastrarOperacional(String nome, Integer id, String cargo, Double salario,
                                            Conta conta){
        Operacional operacional = new Operacional(nome, id, cargo, salario, conta);
        funcionarios.add(operacional);
        return operacional;
    }
    public static Vendedor cadastrarVendedor(String nome, Integer id, String cargo, Double salario){
        ContaCartaoCredito contaCartaoCredito = null;
        for(Funcionario gerente : funcionarios){
            Gerente g1 = (Gerente) gerente;
            if(g1.getCargo().contains("Contas")){
                contaCartaoCredito = new ContaCartaoCredito(g1.getContaEspecial().getLimite());
            }
        }

        Vendedor vendedor = new Vendedor(nome,id,cargo,salario);
        vendedor.setContaCartaoCredito(contaCartaoCredito);
        funcionarios.add(vendedor);
        return vendedor;
    }
}
