package ExerciciosDevDojo.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[]args) {
       /*4 - Faça um algoritmo que receba um número inteiro
       e imprima na tela o seu antecessor e o seu sucessor.
       */
       System.out.println("---------");
       System.out.println("LEITOR DE DADOS");
       System.out.println("---------");

       Scanner sc= new Scanner(System.in);

       System.out.println("Digite um numero inteiro: ");
       int a= sc.nextInt();
       int sucessor= a+1;
       int antecessor= a-1;

       System.out.println("---------");
       System.out.println("Numero digitado:"+ a);
       System.out.println("Numero sucessor: "+sucessor);
       System.out.println("Numero antecessor: "+antecessor);

       sc.close();
       }

    }

