
package formatodata;

import java.util.Scanner;
public class FormatoData {

  Scanner scan = new Scanner(System.in);
    
  public static void main(String[] args) {
        
        String option = "s" ;
        
        //while (option.equals("s") || option.equals("S")){
        
         
        // criando a funçao data
        Data date = new Data ();
        
   
       //Adicionando o dia //date.dia= 10;  //date.condicaoDia(90);
       date.condicaoDia(10);
        
        
        //Adicionando o mês   //date.mes=5; //date.condicaoMes(90);
        date.condicaoMes(5);
        
         
         //adicionando o ano  //date.ano=1994; // date.condicaoAno(90);
         date.condicaoAno(1994);
         
         
         // modos de exibições finais
          System.out.println("data digitada: "+date.dia+"/"+date.mes+"/"+date.ano);
     
       
         
        
    }
    
}
