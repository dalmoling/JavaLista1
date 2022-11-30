//Faça um programa que leia dois números e apresente o fatorial de todos os números
//        que estejam dentro do intervalo definido pelos números que foram lidos

 package com.mycompany.lista1;



public class Atividade09Fat2 {
    public static void main(String[] args) {

        int num1=0,num2=15,num=num2;
        int x=0,f=5;
        x = f;

        for(;num2 > num1; num2--) {
            f = num2;
            for (x = f - 1; x > 1; x--) {
                f = f * x;
            }
            System.out.println("fatorial de " + num-- + "  " +  f);
        }
    }
}