
package ex5elevador_poo1;


public class Elevador {
    
    public int total_Andares;
    public int inicio_Andares;
    public int subindo_Andares;
    public int descendo_Andares;
    public int capacidade;
    public int pessoas;
    public int remover_Pessoas;
    public int aux;
    public int aux2;
    public String  opcao;
    
    
    // inicializando os valores das variaveis
    
    public  Elevador(){
        
        this.inicio_Andares=0;
        this.capacidade=8;
        this.pessoas=0;
        this.aux=0;
        this.aux2=0;
        
    }
    
    //recebendo os dados do usuário  //  //___________ Metodo Inicializa _____________
      public void inicializa(int capacidade,int total_Andares){
          
          this.capacidade=capacidade;
          this.total_Andares=total_Andares;
          
          
      }
    
       //___________ Metodo Entra _____________
      public void entra(int pessoas){
          this.pessoas=pessoas;
          
          System.out.println("pessoas querendo entrar no elevador: "+pessoas);
          System.out.println("capacidade do elevador: "+capacidade);
          if(capacidade>=pessoas){
              System.out.println("Há espaço disponivel!!");
          }
          else{
              System.out.println("Não há espaço disponivel!!");
          }
          
      }
       //___________ Metodo Sai _____________
      public void sai(int remover_Pessoas){
          this.remover_Pessoas=remover_Pessoas;
          
          System.out.println("quantidade de pessoas atualmente no elevador:"+pessoas);
          System.out.println("Quantidade de pessoas que vão ser removidas:"+remover_Pessoas);
          if(pessoas>0){
              aux=pessoas-remover_Pessoas;
              System.out.println("Quantidade de pessoas agora:"+aux);
          }
          else{
              System.out.println("para remover uma pessoa do elevador é preciso que tenha ao menos uma pessoa dentro dele!");
          }
          
      }
      //___________ Metodo Sube _____________
      public void sobe(int subindo_Andares){
          aux=0;
          this.subindo_Andares=subindo_Andares;
          
          System.out.println("Você apertou Subir!");
          System.out.println("Você esta no andar: "+inicio_Andares);
          System.out.println("Você quer subir: "+subindo_Andares+" andares");
          
          if(subindo_Andares<=total_Andares){
              aux=inicio_Andares+subindo_Andares;
              System.out.println("Você chegou no andar: "+aux);
          }
          else{
              System.out.println("Você já está no último Andar!!");
          }
      }
      
       //___________ Metodo Desce  _____________
       public void desce(int descendo_Andares){
          
          this.descendo_Andares=descendo_Andares;
          
          System.out.println("Você apertou Descer!");
          System.out.println("Você esta no andar: "+aux);
          System.out.println("Você quer descer: "+descendo_Andares+" andares");
          
          if(descendo_Andares<=inicio_Andares){
            
              System.out.println("Você já está no Térreo !! "+aux);
          }
          else{
               aux2=aux-descendo_Andares;
              System.out.println("voce chegou no andar: "+aux2);
          }
      }
       
       public void status(String opcao){
           
           System.out.println("Andar: "+aux2);
           System.out.println("Capacidade: "+capacidade);
           System.out.println("Quantidade de pessoas: " +aux);
       }
}

