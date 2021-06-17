
package ex2calculadora_poo1;

public class EX2Calculadora_POO1 {

   
    public static void main(String[] args) {
        
        FuncoesCalc calculadora = new FuncoesCalc ();
        
        // Entrando com 2 valores na calculadora
        
        // entrando com o valor 1 _____________________________//
        
       double x= calculadora.num1 = 1;
        
        // entrando com o valor 2 _____________________________//
        
       double y = calculadora.num2 = 2;
       
        System.out.printf("Valor A:   "+x +"                     ");
        System.out.printf("Valor B:   "+y+"\n\n\n");
        
        // Somando os Valores ___________________________________//
        calculadora.soma(x, y);
        System.out.println("Somatorio: "+calculadora.resultado);
        

       // Subtraindo os Valores  ______________________________//
       calculadora.subtracao(x, y);
       System.out.println("Subtracao: "+calculadora.resultado);
        
       
       // multiplicando os Valores  ______________________________//
       calculadora.mutilplicacao(x, y);
        System.out.println("multiplicacao: "+calculadora.resultado);
        
        // dividindo os Valores  ______________________________//
       calculadora.divisisao(x, y);
        System.out.println("divisao: "+calculadora.resultado);
        
        
        
    }
    
}
