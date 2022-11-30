/*
Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que recebe o valor do salário mínimo e a quantidade de quilowatts consumida
por uma residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência;
• o valo a ser pago com 15% de desconto.
 */

package com.mycompany.lista1;
import java.util.Scanner;


public class exercicio3 {
public static void main(String[] args) {
     
     Scanner ler = new Scanner(System.in);
    
     int salariominimo = 1212;
     double valorkw, valorcasa, kw, desconto;
     
     //consumo
    System.out.printf("Escreva quanto sua casa consome em Kw:\n");
    valorcasa = ler.nextInt();
    
    //valor de cada kw
    
    kw = 1212/5;
    System.out.println("O valor de cada Kw eh : "+kw);
    //valor a ser pago por essa residencia
    valorcasa = kw * valorcasa;
    System.out.println ("Sua casa consome o valor de :"+valorcasa);
    //valor com 15% de desconto
    desconto = 1 - (15/100);
    valorcasa = valorcasa * desconto;
    System.out.println("Valor final eh "+valorcasa);
    
 }
}
