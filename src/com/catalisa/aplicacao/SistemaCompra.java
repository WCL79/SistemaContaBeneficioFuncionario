package com.catalisa.aplicacao;

import com.catalisa.entidade.funcionario.Gerente;
import com.catalisa.entidade.funcionario.Vendedor;

public class SistemaCompra {

    Gerente gerente;
    Vendedor vendedor;

    public static void menu(){

        StringBuilder model = new StringBuilder();
        model.append("Digite:\n");
        model.append(" 0 Para do SAIR do Sistema:\n ");
        model.append(" 1 Para cadatrar Funcionário Gerente:\n ");
        model.append(" 2 Para cadastrar Funcionário Operacional:\n ");
        model.append(" 3 Para cadatrar Funcionário Vendedor:\n ");
        System.out.println(model.toString());
    }

}
