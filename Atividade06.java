//Faça uma calculadora de troco, baseado nas cédulas da nossa moeda

package com.mycompany.lista1;;

public class Atividade06 {
    public static void main(String[] args){

        int notas2=0,notas5=0,notas10=0,notas20=0,notas50=0,notas100=0,notas200=0;
        double C200=200,C100=100,C50=50,C20=20,C10=10,C5=5,C2=2;
        //double M1=0,M050=0,M025=0,M010=0,M005=0,M001=0;
        double custoproduto=100, compra=1525, troco=0;

        troco = compra - custoproduto;
        System.out.println(troco);

        if(troco >= 200){
        do{
            troco -= C200;
            notas200++;
        }while(troco > 200);}
        System.out.println(troco);

        if(troco >= 100){
            do{
                troco -= C100;
                notas100++;
            }while(troco > 100);}
        System.out.println(troco);

        if(troco >= 50){
            do{
                troco -= C50;
                notas50++;
            }while(troco > 50);}
        System.out.println(troco);

        if(troco >= 20){
            do{
                troco -= C20;
                notas20++;
            }while(troco > 20);}
        System.out.println(troco);

        if(troco >= 10){
            do{
                troco -= C10;
                notas10++;
            }while(troco > 10);}
        System.out.println(troco);

        if(troco >= 5){
            do{
                troco -= C5;
                notas5++;
            }while(troco > 5);}
        System.out.println(troco);

        if(troco >= 2){
            do{
                troco -= C2;
                notas2++;
            }while(troco > C2);}
        System.out.println(troco);

        System.out.println("Quantidade de notas de 2 reais: " + notas2);
        System.out.println("Quantidade de notas de 5 reais: " + notas5);
        System.out.println("Quantidade de notas de 10 reais: " + notas10);
        System.out.println("Quantidade de notas de 20 reais: " + notas20);
        System.out.println("Quantidade de notas de 50 reais: " + notas50);
        System.out.println("Quantidade de notas de 100 reais: " + notas100);
        System.out.println("Quantidade de notas de 200 reais: " + notas200);



    }
}
