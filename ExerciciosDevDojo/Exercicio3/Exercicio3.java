package ExerciciosDevDojo.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
   public static void main(String[]args) {
     /*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
     */

       System.out.println("---------");
       System.out.println("LEITOR DE DADOS");
       System.out.println("---------");
       Scanner sc= new Scanner(System.in);

       System.out.println("Digite o valor de A: ");
       double a= sc.nextDouble();
       System.out.println("Digite o valor de B: ");
       double b= sc.nextDouble();


       System.out.println("---------");
       System.out.println("Verificando se os valores sao iguais.");
       if(a==b){
           double soma=a+b;
           System.out.println("Valores iguais!");
           System.out.println("Somando os dois valores: "+ soma);
       }else{
           double multi=a*b;
           System.out.println("Valores diferentes!");
           System.out.println("Multiplicando os dois valores: "+ multi);
       }

       System.out.println("Encerrando.");
        sc.close();




    }
}
