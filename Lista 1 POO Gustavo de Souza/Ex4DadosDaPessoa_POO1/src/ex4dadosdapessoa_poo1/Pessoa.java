
package ex4dadosdapessoa_poo1;


public class Pessoa {
    
    
    public String nome;
    public int dia;
    public int mes;
    public int ano;
    public int idade;
    public double altura;
    
    
    
    public Pessoa(){
        
        this.nome=" digite seu nome: \n";
        this.dia=0;
        this.mes=0;
        this.ano=0;
        this.idade=0;
        this.altura=0 ;
          
    }
    
    public void recebeNome(String nome){
    this.nome=nome;
        
    }
    
    public void recebeDia(int dia){
        this.dia=dia;
    }
     
    public void recebeMes(int mes){
        this.mes=mes;
    }
     public void recebeAno(int ano){
        this.ano=ano;
       
         
         this.idade= 2021-ano;
         System.out.println("Ano Digitado: "+ano);
         System.out.println("Sua idade é: "+this.idade);
        
    }
     
   
        
         
     
      public void recebeAltura(double altura){
        this.altura=altura;
    }
      
      public String getNome(){
          return this.nome;
          
      }
      public int getDia(){
          return this.dia;
      }
      public int getMes(){
          return this.mes;
      }
      public int getAno(){
          return this.ano;
      }
      public double getAltura(){
          return this.altura;
      }
    
}
