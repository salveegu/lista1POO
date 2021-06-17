
package ex6televisão_poo1;


public class Televisao {
    public int sobe_Canal;
    public int desce_Canal;
    public int numero_Canal;
    public int inicial_Volume;
    public int aumenta_Volume;
    public int diminui_Volume;
    public String on_Off;
    public String status_Inicial;
    public String status_Atual;
    public int aux;
    public int aux2;
    public int aux3;
    public int aux4;
    
    //Inicializando a tv
    public Televisao(){
        this.sobe_Canal=1;
        this.status_Inicial="A tv está desligada!";
        this.aux=0;
        this.aux2=0;
        this.inicial_Volume=0;
        this.aux3=0;
        this.aux4=0;
        
    }
    //criando metodo de ligar a tv
    public void ligaTv(String on_Off){
        this.on_Off=on_Off;
        
        if(on_Off.equalsIgnoreCase("liga")){
            
            System.out.println("Tv Ligada!!");
         } 
            else{
                  System.out.println("A tv está desligada!!");  
                    
        }
        
    }
    
    // metodo de digitar o numero do canal de tv
    public void numeroCanal(int numero_Canal){
        this.numero_Canal=numero_Canal;
        
        System.out.println("Aperte o número do Canal desejado no controle: ");
        System.out.println("canal: "+numero_Canal);
    }
    
    //   metodo subir de canal
    public void sobeCanal(int sobe_Canal){
        this.sobe_Canal=sobe_Canal;
        
        System.out.println("Canal Atual: "+numero_Canal);
        System.out.println("Quantos canais deseja subir: "+sobe_Canal);
        aux=numero_Canal+sobe_Canal;
        System.out.println("Canal Atual: "+aux);
       
    }
    
     //   metodo desce de canal
    public void desceCanal(int desce_Canal){
        this.desce_Canal=desce_Canal;
        
        System.out.println("Canal Atual: "+aux);
        System.out.println("Quantos canais deseja descer: "+desce_Canal);
        aux2=aux-desce_Canal;
        System.out.println("Canal Atual: "+aux2);
       
    }
    
     //   metodo aumenta o volume da tv 
    public void aumentaVolume(int aumenta_Volume){
        this.aumenta_Volume=aumenta_Volume;
        
        System.out.println("Volume Atual: "+inicial_Volume);
        System.out.println("Quanto deseja aumentar o volume: "+aumenta_Volume);
        aux3=inicial_Volume+aumenta_Volume;
        System.out.println("Volume Atual: "+aux3);
       
    }
     
     //   metodo diminui o volume da tv 
    public void diminuiVolume(int diminui_Volume){
        this.diminui_Volume=diminui_Volume;
        
        System.out.println("Volume Atual: "+aux3);
        System.out.println("Quanto deseja diminuir o volume: "+diminui_Volume);
        aux4=aux3-diminui_Volume;
        System.out.println("Volume Atual: "+aux4);
       
    }
    
    //metodo Status da TV
    
    public void statusTv(String status_Atual ){
        
        this.status_Atual=status_Atual;
        
        System.out.println("A tv está: "+on_Off);
        System.out.println("Canal Atual: "+aux2);
        System.out.println("O Volume Atual: "+aux4);
        
        
    }
}
