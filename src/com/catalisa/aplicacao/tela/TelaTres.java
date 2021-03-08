package com.catalisa.aplicacao.tela;

import com.catalisa.aplicacao.EntradaSaida;
import com.catalisa.entidade.funcionario.Vendedor;
import com.catalisa.servico.ServicoFuncionario;

public class TelaTres implements TelaStrategy{
    @Override
    public void mostrarTela() {
        EntradaSaida.mostrarTexto("Informe o NOME, ID, CARGO, SALÁRIO: ");
        Vendedor vendedor = ServicoFuncionario.cadastrarVendedor(
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextInt(),
                EntradaSaida.criarScanner().nextLine(),
                EntradaSaida.criarScanner().nextDouble());
        EntradaSaida.mostrarTexto(vendedor.toString());
    }
}
