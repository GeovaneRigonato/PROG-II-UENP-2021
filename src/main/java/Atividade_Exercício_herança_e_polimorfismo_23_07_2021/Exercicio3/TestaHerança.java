/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio3;

/**
 *
 * @author geovane_rigonato
 */
public class TestaHerança {
    public static void main(String[] args) {
        
         BebidasAlcoolicas B = new BebidasAlcoolicas("Skol","Skol", 4.4);
         BebidasAlcoolicas B1 = new BebidasAlcoolicas("Brahma","Brahma", 4.8);
         BebidasAlcoolicas B2 = new BebidasAlcoolicas("Heineken","Heineken", 5.0);
         BebidasAlcoolicas B3 = new BebidasAlcoolicas("Skol Beats","Skol", 8.0);
         Refrigerante R  = new Refrigerante("Coca-Cola", "Coca", "Cola");
         Refrigerante R1 = new Refrigerante("Fanta laranja", "Fanta", "Laranja");
         Refrigerante R2 = new Refrigerante("Guaraná Antartica", "Guaraná", "Guaraná");
         Refrigerante R3 = new Refrigerante("Pepsi Twist", "Pepsi", "Gemgibre");
         Suco S= new Suco("Suco de abacaxi", "Natural", "abacaxi");
         Suco S1= new Suco("suco de uva", "Garibaldi", "uva");
         Suco S2= new Suco("Suco de laranja com maçã", "Natural", "laranja com maçã");
         Suco S3= new Suco("Del Valle Kapo de morango", "Del Valle", "Morango");
         
         System.out.println("Bebidas Alcoólicas:");     
         System.out.println("Nome -> "+B.getNome()+ "       | Marca: "+B.getMarca() + "     | Teor Alcoólico: " + B.getTeorAlcoolico() + " %");
         System.out.println("Nome -> "+B1.getNome()+ "     | Marca: "+B1.getMarca() + "   | Teor Alcoólico: " + B1.getTeorAlcoolico() + " %");
         System.out.println("Nome -> "+B2.getNome()+ "   | Marca: "+B2.getMarca() + " | Teor Alcoólico: " + B2.getTeorAlcoolico() + " %");
         System.out.println("Nome -> "+B3.getNome()+ " | Marca: "+B3.getMarca() + "     | Teor Alcoólico: " + B3.getTeorAlcoolico() + " %\n");
         System.out.println("Refrigerantes:"); 
         System.out.println("Nome -> "+R.getNome()+ "         | Marca: "+R.getMarca() + "    | Sabor: " + R.getSabor());
         System.out.println("Nome -> "+R1.getNome()+ "     | Marca: "+R1.getMarca() + "   | Sabor: " + R1.getSabor());
         System.out.println("Nome -> "+R2.getNome()+ " | Marca: "+R2.getMarca() + " | Sabor: " + R2.getSabor());
         System.out.println("Nome -> "+R3.getNome()+ "       | Marca: "+R3.getMarca() + "   | Sabor: " + R3.getSabor()+"\n");
         System.out.println("Sucos:");
         System.out.println("Nome -> "+S.getNome()+ "           | Marca: "+S.getMarca() + "   | Fruta: " + S.getFruta());
         System.out.println("Nome -> "+S1.getNome()+ "               | Marca: "+S1.getMarca() + " | Fruta: " + S1.getFruta());
         System.out.println("Nome -> "+S2.getNome()+ "  | Marca: "+S2.getMarca() + "   | Fruta: " + S2.getFruta());
         System.out.println("Nome -> "+S3.getNome()+ " | Marca: "+S3.getMarca() + " | Fruta: " + S3.getFruta());
         
    }
    
    
}
