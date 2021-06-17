/*  Crie uma classe 	para representar uma Conta Corrente, que deverá ter como 	
propriedades o número da agência, o número da conta, o saldo, e 	
limite. Como métodos, implementar saque(), deposito() e saldo().
*/

package ex1banco;
import java.util.Scanner;

public class Ex1Banco {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ContaCorrente minhaConta = new ContaCorrente();
        
        System.out.println("Saldo da conta: R$ "+minhaConta.getSaldo());
       
        
        // cadastrando a agencia e conta
        minhaConta.agencia = "1234";
        minhaConta.conta = "67877-3";
        
       
        // Deposito na conta      
        minhaConta.deposito(150);
        System.out.println( "Sua conta: "+minhaConta.conta + "      Agencia: " +minhaConta.agencia+   
        "    Valor DEPOSITADO: R$ "+minhaConta.getDeposito());
        System.out.println("Saldo da conta: R$ "+minhaConta.getSaldo());
        
        
        // Saque da conta
        
        minhaConta.saque(20);
        System.out.println("Valor do Saque: R$ "+minhaConta.aux);
        System.out.println("Saldo da Conta: R$ "+minhaConta.getSaldo());
        System.out.println("Limite da conta: R$ "+minhaConta.getLimite());
     
        
        
    }
    
}
