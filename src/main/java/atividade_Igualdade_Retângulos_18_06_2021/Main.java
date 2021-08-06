/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Igualdade_Retângulos_18_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
        public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(10,10);

        r1.setLado1(10); //Atribuir valor ao lado1 através do setLado1
        r1.setLado2(15); //Atribuir valor ao lado2 através do setLado2
        
        System.out.println("Retângulo 1 - " + r1.getLado1() + " " + r1.getLado2());
        System.out.println("Retângulo 2 - " + r2.getLado1() + " " + r2.getLado2());

        //verificar igualdade e retornar falso ou verdadeiro
        System.out.println(Retangulo.verificarIgualdade(r1));
        System.out.println(Retangulo.verificarIgualdade(r2));
    }
    
}
