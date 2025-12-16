package ExerciciosDevDojo.Exercicio6;

public class Reajuste {
    private double valor;
    private double reajuste;

    public Reajuste(double valor){
        this.valor=valor;
        this.reajuste=valor*0.5;
    }

    public void setValor(double valor){
        this.valor=valor;
        this.reajuste=valor*0.5;
    }
    public double getvalor(){
        return valor;
    }


    public void setReajuste(double reajuste){
        this.reajuste=reajuste;
    }
    public double getReajuste(){
        return reajuste;
    }
    public void imprimir(){
        System.out.println("O valor e de: "+this.valor);
        System.out.println("Com o reajuste o valor de "+valor+" vai para " +(valor+reajuste));
    }
}
