package ex5elevador_poo1;

import java.util.Scanner;

public class Ex5Elevador_POO1 {

   
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x =1;
        while(x==1){
        
         Elevador eleva = new Elevador();
        System.out.println("_______________________________________________________");

        System.out.println("_______________________________________________________");
        
        System.out.println("_______________________________________________________");
        eleva.inicializa(8, 10);
        System.out.println("Metodo Inicializa!");
        System.out.println("Entre com capacidade do elevador e o total de andares: ");
        System.out.println("Capacidade: "+eleva.capacidade);
        System.out.println("Total de Andares: "+eleva.total_Andares);
        System.out.println("Andar atual: "+eleva.inicio_Andares);
        
        System.out.println("_______________________________________________________");
        System.out.println("Metodo Entra!");
        System.out.println("Digite o numero de pessoas para entrar no elevador...");
        eleva.entra(5);
        
        System.out.println("_______________________________________________________");
        System.out.println("Metodo Sai!");
        System.out.println("Digite quantas pessoas deseja remover do elevador...");
        eleva.sai(1);
        
        System.out.println("_______________________________________________________");
        System.out.println("Metodo Sobe!");
        System.out.println("Digite quantos andares deseja subir...");
        eleva.sobe(7);
        
        System.out.println("_______________________________________________________");
        System.out.println("Metodo Desce!");
        System.out.println("Digite quantos andares deseja Descer...");
        eleva.desce(2);
        
        System.out.println("_______________________________________________________");
        System.out.println("Metodo Status!");
        eleva.status("ok");
         
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");

            System.out.println("Digite 1 para rodar o programa novamente, ");
                    
            System.out.println("ou qualquer outro número para encerrar o programa!");
               x = scan.nextInt();
             System.out.println("_______________________________________________________");

        }
        
  }
  
}

