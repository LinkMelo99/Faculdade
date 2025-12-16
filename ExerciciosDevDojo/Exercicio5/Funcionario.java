package ExerciciosDevDojo.Exercicio5;

public class Funcionario {
   private String nome;
   private double salario;

   public Funcionario(String nome,double salario){
       this.nome= nome;
       this.salario= salario;
   }
   public void setNome(String nome){
       this.nome=nome;
    }
   public String getnome(){
       return nome;
   }
   public void setSalario(double salario){
       this.nome=nome;
    }
   public double getSalario(){
       return salario;
   }

   public void CalculoSalario(){
       double Calculo;
       Calculo=this.salario/1292.20;
       System.out.printf("O funcionario recebe cerca de " +"%.2f%n salarios minimos",Calculo);
   }

}
