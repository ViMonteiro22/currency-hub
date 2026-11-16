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

        // SOLICITAR O VALOR DE CONVERSÃO

        double valor = 0;

        while (valor <= 0) {
            System.out.println("Digite o valor que deseja converter: ");
            valor = entrada.nextDouble();

            if (valor <= 0){
                System.out.println("O valor informado deve ser maior que zero.");
            } else {
                System.out.println("Valor válido!");
            }
        }

        System.out.println("Valor informado: " + valor);

        // SOLICITAR A MOEDA DE ORIGEM

        String moedaOrigem = "";
        boolean moedaValida = false;

        while (!moedaValida) {
            System.out.println("Digite a moeda de origem (BRL, USD, EUR):");
            moedaOrigem = entrada.next();

            if (moedaOrigem.equalsIgnoreCase("BRL") ||
                    moedaOrigem.equalsIgnoreCase("USD") ||
                    moedaOrigem.equalsIgnoreCase("EUR")) {

                moedaValida = true;
                System.out.println("Moeda válida!");

            } else {
                System.out.println("Moeda inválida! Tente novamente.");
            }
        }

        // SOLICITAR A MOEDA DE DESTINO

        String moedaDestino = "";
        boolean moedaValidaDestino = false;

        while (!moedaValidaDestino) {
            System.out.println("Digite a moeda destino (BRL, USD, EUR):");
            moedaDestino = entrada.next();

            if (moedaDestino.equalsIgnoreCase("BRL") ||
                    moedaDestino.equalsIgnoreCase("USD") ||
                    moedaDestino.equalsIgnoreCase("EUR")) {

                moedaValidaDestino = true;
                System.out.println("Moeda válida!");

            } else {
                System.out.println("Moeda inválida! Tente novamente.");
            }
        }

        // RESUMO FINAL

        System.out.println("===== RESUMO DA CONVERSÃO =====\n"
                + "Valor: " + valor + "\n"
                + "Origem: " + moedaOrigem + "\n"
                + "Destino: " + moedaDestino);
    }
}
