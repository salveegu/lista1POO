
package formatodata;


// criando  as variáveis
public class Data {
    
    
    public int dia;
    public int mes;
    public int ano;
    
    
    
    // Iniciando o metodo com os valores
    public Data (){
        
        this.dia=0;
        this.mes=0;
        this.ano=0;
    }
    
   
    // criando condiçoes para os dados recebidos do usuario --- Dia
    
    public  void  condicaoDia (int dia ){
        this.dia=dia;
        
        if (dia>=1 && dia<=31){
          
            System.out.println("dia digitado: "+dia);
           
        }
        else{
            System.out.println("dia digitado: "+dia);
            System.out.println("Digite o dia no Formato 'xx'  sendo   1<=xx<=31");
            
        }
    }   
    
    
     // criando condiçoes para os dados recebidos do usuario --- MES
        public void condicaoMes(int mes){
         this.mes =mes;
         
         if (this.mes>=1 && this.mes<=12){
         this.mes = mes;
            System.out.println("mes digitado:"+mes);
        }
        else{
             System.out.println("mes digitado:"+mes);
            System.out.println("Digite o mes no Formato 'xx'  sendo   1<=xx<=12");
        }
      }
        
         // criando condiçoes para os dados recebidos do usuario --- Ano
        
        public void condicaoAno(int ano){
        
        this.ano=ano;
            
        if (this.ano>=1900 && this.mes<=2021){
        this.ano = ano;
            System.out.println("ano digitado: "+ano);
        }
        else{
            System.out.println("ano digitado: "+ano);
            System.out.println("Digite o ano no Formato 'xxxx'  sendo   1900<=xxxx<=2021");
        }
       
     }  
      
       
        
        public int getDia(){
            return this.dia;
            
        }
         public int getMes(){
            return this.dia;
            
        }
          public int getAno(){
            return this.dia;
            
        }
}
