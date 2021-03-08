package com.catalisa.aplicacao.tela;

import java.util.HashMap;

public class ContextoTela {
    private HashMap<Integer, TelaStrategy> telaStrategyHashMap = new HashMap<>();

    public void setTelaStrategyHashMap(Integer chave, TelaStrategy tela) {
        telaStrategyHashMap.put(chave, tela);
    }

    public void executarTela(Integer chave) {
        telaStrategyHashMap.get(chave).mostrarTela();
    }
}
