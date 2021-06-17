
package ex2calculadora_poo1;

// criação das variaveis
public class FuncoesCalc {
    
    public double num1;
    public double num2;
    public double resultado;
   
    
    // Instanciando e recebendo os valores
    
     
    public  FuncoesCalc (){
      
    }
// Instanciando e recebendo os valores
    public  FuncoesCalc (double num1,double num2){
        this.num1=num1;
        this.num2=num2;
        
    }
    
    //Criando operação de Soma
    public double soma(double num1,double num2){
       resultado = this.num1+this.num2;
       return resultado;
        
    }
    
    //Criando operação de subtração
    public double subtracao(double num1, double num2){
        resultado=num1-num2;
        return resultado;
    }
 
    //Criando operação de multiplicação
    public void mutilplicacao(double num1, double num2){
        resultado=num1*num2;
    }
    
    //Criando operação de divisao
    public void divisisao(double num1, double num2){
        if(num2==0){
            System.out.println("Não existe divisão por 0!");
        }
    else
            resultado=num1/num2;
    }
    
    
    
}
