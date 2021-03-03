package com.catalisa.aplicacao;

import java.util.Scanner;

public class EntradaSaida {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }
    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }
}
