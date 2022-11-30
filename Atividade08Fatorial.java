//Faça um programa que leia um número e calcule o fatorial desse número

 package com.mycompany.lista1;

public class Atividade08Fatorial {
 
    public static void main(String[] args) {


        int x=0,f=5;
        x = f;

        for(x=f-1; x>1; x--){
            f = f * x;
        }
        System.out.println(f);
    }
}
