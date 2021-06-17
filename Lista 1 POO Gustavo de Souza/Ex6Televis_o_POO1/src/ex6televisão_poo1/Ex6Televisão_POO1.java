
package ex6televisão_poo1;
import java.util.Scanner;

public class Ex6Televisão_POO1 {

    
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Televisao tv = new Televisao();
        
        String opcao ="sim";
        
        while (opcao.equals("sim")||opcao.equals("SIM")){
        
        //Vendo o Status Inial da Tv
        System.out.println("____________________________");
        System.out.println("status inicial da tv: ");
        System.out.println(tv.status_Inicial);
        System.out.println("____________________________");
        
        //Ligando a TV
        System.out.println(" || Metodo Ligar TV ||  ");
        tv.ligaTv("liga");
        System.out.println("____________________________");
        
        //Trocando de canal numero especifico
        System.out.println(" || Metodo canal especifico da  TV - canal 5 Globo ||  ");
        tv.numeroCanal(5);
        System.out.println("____________________________");
        

        
         //Subindo Dois canais na tv
        System.out.println(" || Metodo subindo dois canais na TV - canal 7  ||  ");
        tv.sobeCanal(2);
        System.out.println("____________________________");
        
         //Subindo Descendo canais na tv
        System.out.println(" || Metodo descendo 1 canal na TV - canal 6  ||  ");
        tv.desceCanal(1);
        System.out.println("____________________________");
        
        
        //Subindo o volume da tv
        System.out.println(" || Metodo aumentando o volume da tv para 30 ||  ");
        tv.aumentaVolume(30);
        System.out.println("____________________________");
        
        //diminundo o volume da tv
        System.out.println(" || Metodo diminuindo o volume da tv para 20 ||  ");
        tv.diminuiVolume(10);
        System.out.println("____________________________");
        
        //Exibindo o Status final da tv
        
       
        System.out.println("____________________________");
        tv.statusTv("status");
         System.out.println("____________________________");
          System.out.println("____________________________");
         System.out.println("digite sim para rodar o programa novamente...");
        System.out.println("digite nao para cancelar...");
        opcao=scan.next();
       
        
        }
       
    }
    
}
