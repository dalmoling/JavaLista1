/*
 Faça um programa que receba o salário base de um funcionário, calcule e mostre o
salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
 base e paga imposto de 7% sobre este salário.
 */
package com.mycompany.lista1;
import java.util.Scanner;

/**
 *
 * @author Dalmolin
 */
public class exercicio2 {
  public static void main(String[] args) {
  
    double salariobase,salariofinal;
    double gratificacao, imposto;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe seu salario base:");
    salariobase = teclado.nextDouble();
    
    gratificacao = 1.05;//calculo vai dar esse valor
    imposto = 0.93;
            
    salariofinal = salariobase * gratificacao;  //gratificação
    salariofinal = (salariofinal*imposto);
    System.out.println("Salario final eh :" + salariofinal);
    
    }
}
