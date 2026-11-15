package com.currencyhub;

import java.util.Scanner;

public class CurrencyHubApplication {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
        ================================
                 CURRENCYHUB
        ================================
        Bem-vindo ao conversor de moedas!
        Versão do sistema: 1.0
        """);

        System.out.println("Digite o valor que deseja converter: ");
        double valor = entrada.nextDouble();

        System.out.println("Valor informado: " + valor);

        System.out.println("Digite a moeda de origem (BRL, USD, EUR): ");
        String moedaDeOrigem = entrada.next();

        System.out.println(moedaDeOrigem);

        System.out.println("Digite a moeda de destino (BRL, USD, EUR): ");
        String moedaDeDestino = entrada.next();

        System.out.println(moedaDeDestino);

        System.out.println("===== RESUMO DA CONVERSÃO =====\n"
                + "Valor: " + valor + "\n"
                + "Origem: " + moedaDeOrigem + "\n"
                + "Destino: " + moedaDeDestino);
    }
}
