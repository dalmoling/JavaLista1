/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
//obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.

package com.mycompany.lista1;
import java.util.Scanner;
public class Lista1 {

    public static void main(String[] args) {
       
        int l1 , l2 ,l3; //lados
        int ang1, ang2, ang3; //angulos
        int t;//triangulo
        
        String lado="";
        String angulo="";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Informe um número para o lado 1:");
        l1 = teclado.nextInt();
        System.out.printf("Informe um número para o lado 2:");
        l2 = teclado.nextInt();
        System.out.printf("Informe um número para o lado 3:");
        l3 = teclado.nextInt();
        
        if(l1!=l2&&l2!=l3){
            System.out.println("é um triangulo Escaleno");  
            lado = "Triangulo Escaleno";
        }
        if(l1==l2||l2==l3&&l1!=l3){
            System.out.println("é um triangulo Isosceles");  
            lado="Triangulo Isosceles";
        }
        if(l1==l2&&l2==l3){
            System.out.println("é um triangulo equilatero");  
            lado="Triangulo equilatero";
        }
      
        //angulos
       System.out.printf("Informe um angulo para o angulo 1:");
        ang1 = teclado.nextInt();
        System.out.printf("Informe um angulo para o angulo 2:");
        ang2 = teclado.nextInt();
        System.out.printf("Informe um angulo para o angulo 3:");
        ang3 = teclado.nextInt();
        //relação angulo
        if(ang1<90&&ang2<90&&ang3<90){
            System.out.println("é um triangulo Acutangulo");  
            angulo = "Triangulo Acutangulo";
        }
        if(ang1 == 90 || ang2 == 90 || ang3==90){
            System.out.println("é um triangulo Retangulo");  
            angulo ="Triangulo Retangulo";
        }
        if(ang1 > 90 || ang2 > 90 || ang3 > 90){
            System.out.println("é um triangulo obtusangulo");  
            angulo="Triangulo obtusanulo";
        }
    }
}
