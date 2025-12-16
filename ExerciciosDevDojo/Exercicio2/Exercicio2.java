package ExerciciosDevDojo.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
   public static void main(String[]args) {
      /*2 - Faça um algoritmo para receber um número qualquer
       e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
      */
       System.out.println("----"+"----");
       System.out.println("LEITOR DE DADOS");
       System.out.println("----"+"----");

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite qualquer numero: ");
       double a= sc.nextDouble();
       System.out.println("---------");
       System.out.println("Verificando se o numero e impar ou par!");
       if(a % 2==0){
           System.out.println("O numero e par.");
       }else{
           System.out.println("O numero e impar.");
       }
       System.out.println("---------");
       System.out.println("Verificando se o numero e positivo ou negativo.");

       if(a>0){
           System.out.println("O numero e positivo.");
       }else{
           System.out.println("O numero e negativo.");
       }

     sc.close();
    }
}
