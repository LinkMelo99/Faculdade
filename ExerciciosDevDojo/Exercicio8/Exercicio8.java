package ExerciciosDevDojo.Exercicio8;

import java.util.Scanner;

public class Exercicio8 {
   public static void main(String[]args) {
      //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
      double valor1, valor2,valor3;


      Scanner sc= new Scanner(System.in);

       System.out.print("Digite o primeiro valor: ");
       valor1=sc.nextDouble();
       System.out.print("Digite o segundo valor: ");
       valor2=sc.nextDouble();
       System.out.print("Digite o terceiro valor: ");
       valor3=sc.nextDouble();

       double maior, meio, menor;

       if (valor1 > valor2 && valor1 > valor3) {
           maior = valor1;
           if (valor2 > valor3) {
               meio = valor2;
               menor = valor3;
           } else {
               meio = valor3;
               menor = valor2;
           }
       } else if (valor2 > valor1 && valor2 > valor3) {
           maior = valor2;
           if (valor1 > valor3) {
               meio = valor1;
               menor = valor3;
           } else {
               meio = valor3;
               menor = valor1;
           }
       } else { // c é o maior
           maior = valor3;
           if (valor1 > valor2) {
               meio = valor1;
               menor = valor2;
           } else {
               meio = valor2;
               menor = valor1;
           }
       }
       System.out.println("Valores em ordem decrescente:");
       System.out.println(maior);
       System.out.println(meio);
       System.out.println(menor);

       sc.close();

    }
}
