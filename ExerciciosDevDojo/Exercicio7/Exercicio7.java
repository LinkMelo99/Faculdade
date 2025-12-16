package ExerciciosDevDojo.Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
   public static void main(String[]args) {
      /*7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
       e determine se ambos são VERDADEIRO ou FALSO.
      */
       boolean valorA;
       boolean valorB;

       Scanner sc = new Scanner(System.in);
       System.out.print("Digite se A e V/F: ");
       valorA=sc.nextBoolean();


       System.out.print("Digite se B e V/F: ");
       valorB=sc.nextBoolean();

       if (valorA && valorB) {
           System.out.println("Ambos os valores são VERDADEIROS");
       }
       else if (!valorA && !valorB) {
           System.out.println("Ambos os valores são FALSOS");
       }
       else {
           System.out.println("Os valores são DIFERENTES (um verdadeiro e um falso)");
       }

       System.out.println("Valor A: " + valorA);
       System.out.println("Valor B: " + valorB);

       sc.close();
    }
}
