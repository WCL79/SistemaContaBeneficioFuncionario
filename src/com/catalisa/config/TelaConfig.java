package com.catalisa.config;

import com.catalisa.aplicacao.tela.ContextoTela;
import com.catalisa.aplicacao.tela.TelaDois;
import com.catalisa.aplicacao.tela.TelaTres;
import com.catalisa.aplicacao.tela.TelaUm;

public class TelaConfig {
    private ContextoTela contextoTela;

    public TelaConfig() {
        contextoTela = new ContextoTela();
        contextoTela.setTelaStrategyHashMap(1, new TelaUm());
        contextoTela.setTelaStrategyHashMap(2, new TelaDois());
        contextoTela.setTelaStrategyHashMap(3, new TelaTres());
    }
}
