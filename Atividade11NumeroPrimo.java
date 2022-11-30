//Faça um programa que receba dez números inteiros e mostre a quantidade de números
//        primos dentre os número que foram digitados

package com.mycompany.lista1;

import java.util.Scanner;

public class Atividade11NumeroPrimo {


    public static void main(String[] args) {

        int[] numero= new int[10];
        int[] ehprimo = new int[10];
        int i,j;
        int naoprimo=0,primo=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Caro usuário, digite por favor 10 números inteiros");
        System.out.println("Iremos descobrir se esses números são primos!!");
        for ( i=0; i<10; i++) {
            numero[i] = teclado.nextInt();
        }

        for (i=0;i<10;i++) {
            naoprimo=0;
            if (numero[i] <= 1) {
            }
            for (j = 2; j <= numero[i]; j++) {
                if (numero[i] % j == 0) {
                    naoprimo++;
                }

            }
            if (naoprimo < 2) {
                primo++;
                System.out.println(numero[i]);

            }
        }
        System.out.println("A quantidade de números primos são: " + primo);
    }}