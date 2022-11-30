//Faça um programa que leia um conjunto não
//        determinado de valores, um de cada
//        vez, e
//        escreva uma tabela com cabeçalho
//        que deve ser repetido a cada vinte linhas. A tabela
//        deverá conter o valor lido, seu cubo
//        e sua raiz quadrada. Finalize quando a entrada for
//        um número negativo ou 0

package com.mycompany.lista1;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        int cont=0;
        double n = 0;
        double cubo = 0, raiz = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Q digite quantos numeros voce quiser");
        System.out.println("Se digitar 0 ou -N o programa nao vai funcionar");
        System.out.printf("%10s %10s %10s", "numero", "cubo", "raiz\n");


        do {
            n = teclado.nextDouble();

            cubo = Math.pow(n, 3);
            raiz = Math.sqrt(n);

            System.out.printf("%10.2f %10.2f %10.2f", n, cubo, raiz);
            System.out.println("");
            cont++;
            if(cont > 19){
                System.lineSeparator();
                //System.out.println(" ");
                System.out.printf("%10s %10s %10s", "numero", "cubo", "raiz\n");

                cont = 0;
            }
        }while (n>0);
    }
}
