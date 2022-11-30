/*
Faça um programa que receba
• O código do produto comprado;
• A quantidade comprada do produto
Calcule e mostre:
• O preço unitário do produto comprado, seguindo a Tabela I;
• O preço total da nota;
• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
• O preço final da nota depois do desconto.

 */
package com.mycompany.lista1;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    
       int cod, quant = 0, valor = 0;
       
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Escreva o cod do produto");
     cod = sc.nextInt();
     
     System.out.println("Escreva a quantidade do produto");
     quant = sc.nextInt();
     
   
    
