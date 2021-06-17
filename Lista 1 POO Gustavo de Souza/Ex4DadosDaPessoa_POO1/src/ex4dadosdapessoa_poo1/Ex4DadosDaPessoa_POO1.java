/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4dadosdapessoa_poo1;

/**
 *
 * @author guto_
 */
public class Ex4DadosDaPessoa_POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Pessoa dadosPessoa = new Pessoa();
        
        System.out.println("Digite seu nome: ");
        dadosPessoa.recebeNome("Gustavo");
        System.out.println(dadosPessoa.nome);
        
        
        
        System.out.println("_____________________________________");
        System.out.println("Digite sua Altura: ");
        dadosPessoa.recebeAltura(1.75);
        System.out.println("Altura: "+dadosPessoa.altura);
        System.out.println("_____________________________________");
        
        
        
        System.out.println("_____________________________________");
        System.out.println("Digite sua data de  Nascimento: ");
        dadosPessoa.recebeDia(30);
        System.out.println("Dia: "+dadosPessoa.dia);
        System.out.println("_____________________________________");
        
        dadosPessoa.recebeMes(06);
        System.out.println("Mes: "+dadosPessoa.mes);
        System.out.println("_____________________________________");
        
        dadosPessoa.recebeAno(1994);
        
        System.out.println("_____________________________________");
        System.out.println("Data de Nascimento: "+dadosPessoa.getDia()+"/"
        +dadosPessoa.getMes()+"/"+dadosPessoa.ano);
        
        
        System.out.println(dadosPessoa.nome);
        
        System.out.println("Sua Altura é: "+dadosPessoa.altura);
        
    }
    
}
