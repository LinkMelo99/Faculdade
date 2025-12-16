package ExerciciosDevDojo.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args) {
        /*1 - Faça um algoritmo que leia os valores de A, B, C e
         em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.*/
        System.out.println("------"+"------");
        System.out.println("LEITOR DE DADOS");
        System.out.println("------"+"------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor para a variavel 'A': ");
        double a =sc.nextDouble();
        System.out.print("Insira um valor para a variavel 'B': ");
        double b= sc.nextDouble();
        System.out.print("Insira um valor para a variavel 'C': ");
        double c= sc.nextDouble();

        double soma= a+b;
        System.out.println("SOMANDO!!");
        System.out.println("O valor da soma de A + B e :"+ soma );

        if(soma<c){
            System.out.println("A soma da variavel A e B e menor que C");
        }else{
            System.out.println("C e menor que a soma de A e B");
        }

        sc.close();


    }
}
