//Faça um programa que receba
//        • O código do produto comprado;
//        • A quantidade comprada do produto
//        Calcule e mostre:
//        • O preço unitário do produto comprado, seguindo a Tabela I;
//        • O preço total da nota;
//        • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
//        • O preço final da nota depois do desconto.

package com.mycompany.lista1;
import java.util.Scanner;

public class Atividade05Compra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String s = "Olá Mundo";
        byte cdproduto = 1;
        int qdproduto = 105, valorproduto = 0, cddproduto = 0, totalnota = 0;
        double descontonota = 0, notadesconto = 0;
        switch (cdproduto) {
            case 1:
                System.out.println("Banana");
                valorproduto = 5;
                cddproduto = 5;
                break;
            case 2:
                System.out.println("Pêra");
                valorproduto = 15;
                cddproduto = 15;
                break;
            case 3:
                System.out.println("Maça");
                valorproduto = 25;
                cddproduto = 25;
                break;
        }
        System.out.println("O valor de cada unidade é: "+valorproduto);
        System.out.println("Quantidade de produtos comprados: " + qdproduto);
        totalnota = valorproduto * qdproduto;
        System.out.println("Valor total: " + totalnota);

        if (totalnota <= 250) {
            descontonota = 0.05;
        } else if (totalnota > 250 && totalnota <= 500) {
            descontonota = 0.10;
        } else {
            descontonota = 0.15;
        }

        descontonota *= totalnota;
        System.out.println("Desconto de: " + descontonota);
        notadesconto = totalnota - descontonota;
        System.out.println("Total depois do desconto: " + notadesconto);

    }
}