
package ex1banco;


public class ContaCorrente {
    
    public String agencia;
    public String conta;
    public double limite;
    public double saldo;
    public double aux;
    
    // Inicializando os valores diretamente
    public ContaCorrente(){
        this.saldo=0.0;
        this.limite=1000.00;
    }
    

    // Recebendo os dados digitadas pelo usuário
    public ContaCorrente(String agencia, String conta, double limite, double saldo, double aux){
        
        this.agencia = agencia;
        this.conta = conta;
        this.limite= limite;
        this.saldo = saldo;
        this.aux = aux;
        
    }
    
    // metodo para OBTER(ME DE) mostre mostra o saldo
      public double getSaldo (){
      return this.saldo;
  }    
    
      // recebe o deposito
      public void deposito (double valor){
          this.saldo += valor;
          this.aux=valor;
          
      }
      
      //mostre o valor depositado
      
      public double getDeposito(){
          return this.saldo;
      }
      
    
      public void saque (double valor){
         
          if (this.limite+this.saldo>=valor){
          this.saldo -= valor;
          this.aux=valor;
          System.out.println("Saldo Positivo!");
          }
          else{
              System.out.println("Saldo insuficiente!!");
          }
      }
      
       //mostre o valor SACADO
      
      public double getSaque(){
          return this.saldo;
      }
      
       //mostra o limite da conta
      public double getLimite(){
          return this.limite;
      }
}
