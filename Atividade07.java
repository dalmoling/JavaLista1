package com.mycompany.lista1;;
import java.util.Scanner;

//Em um campeonato de futebol existem cinco times e cada um possui 11
// jogadores.
//        Faça um programa que receba a idade, o peso e a altura de cada
//        um dos jogadores,
//        calcule e mostre:
//• a quantidade de jogadores com idade inferior a 18 anos;

//Pedro
//        85
//        17
//        190
//
//        Jose
//        75
//        21
//        175
//
//        Roberto
//        67
//        17
//        180


public class Atividade07 {
    public static void main(String[] args) {


        String[] jogador = new String[3];
        String[] jogador1 = new String[3];
        String[] jogador2 = new String[3];
        double[] peso = new double[3];
        double[] peso1 = new double[3];
        double[] peso2 = new double[3];
        int[] idade = new int[3];
        int[] idade1 = new int[3];
        int[] idade2 = new int[3];
        int[] altura = new int[3];
        int[] altura1 = new int[3];
        int[] altura2 = new int[3];

        int i, j,f, menores=0,idades=0,idades1=0,idades2=0,alturas=0,pesados=0;

        Scanner teclado = new Scanner(System.in);

        for(i=0;i<3;i++){



            System.out.print("Entre com o nome do Jogador " + i);
            jogador[i] = teclado.nextLine() ;
            System.out.print("Entre com o peso do Jogador " + i);
            peso[i] = teclado.nextDouble();
            System.out.print("Entre com a idade " + i);
            idade[i] = teclado.nextInt();
            System.out.print("Entre com a altura do jogador " + i);
            altura[i] = teclado.nextInt();
            teclado.nextLine();

            idades += idade[i];
            alturas += altura[i];

            if(idade[i] < 18){
                menores++;
            }

            if(peso[i] > 80){
                pesados++;
            }
        }

        for(f=0;f<3;f++){



            System.out.print("Entre com o nome do Jogador1 " + f);
            jogador1[f] = teclado.nextLine() ;
            System.out.print("Entre com o peso do Jogador1 " + f);
            peso1[f] = teclado.nextDouble();
            System.out.print("Entre com a idade1 " + f);
            idade1[f] = teclado.nextInt();
            System.out.print("Entre com a altura do jogador1 " + f);
            altura1[f] = teclado.nextInt();
            teclado.nextLine();

            idades1 += idade1[f];
            alturas += altura1[f];

            if(idade1[f] < 18){
                menores++;
            }

            if(peso1[f] > 80){
                pesados++;
            }
        }

        for(i=0;i<3;i++){



            System.out.print("Entre com o nome do Jogador2 " + i);
            jogador2[i] = teclado.nextLine() ;
            System.out.print("Entre com o peso do Jogador2 " + i);
            peso2[i] = teclado.nextDouble();
            System.out.print("Entre com a idade2 " + i);
            idade2[i] = teclado.nextInt();
            System.out.print("Entre com a altura do jogador2 " + i);
            altura2[i] = teclado.nextInt();
            teclado.nextLine();

            idades2 += idade2[i];
            alturas += altura2[i];

            if(idade2[i] < 18){
                menores++;
            }

            if(peso2[i] > 80){
                pesados++;
            }
        }

//        • a média das idades dos jogadores de cada time;
//        • a média das alturas de todos os jogadores do campeonato;
//        • a porcentagem de jogadores com mais de 80kg entre todos os jogadores do cam-
//        peonato

        idades = idades / 9;
        System.out.println("Media das idades" + idades);
        idades1 = idades1 / 9;
        System.out.println("Media das idades do 2 time " + idades1);
        idades2 = idades2 / 9;
        System.out.println("Media das idades do 3 time " + idades2);
        alturas = alturas / 9;
        System.out.println("Media das alturas" + alturas);

        pesados = pesados * 100 / 9;
        System.out.println("Porcentagem dos pesos" + pesados + "%");


    }

}
