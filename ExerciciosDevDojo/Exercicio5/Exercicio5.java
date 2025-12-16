package ExerciciosDevDojo.Exercicio5;


public class Exercicio5 {
   public static void main(String[]args) {
       /*5 - Faça um algoritmo que leia o valor do
       salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
       usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        */
       System.out.println("=========="+"==========");
       System.out.println("Calculadora de Salario Minimo.");
       System.out.println("=========="+"==========");


       Funcionario f1= new Funcionario("Matheus",2586.4);

       f1.CalculoSalario();


    }
}
