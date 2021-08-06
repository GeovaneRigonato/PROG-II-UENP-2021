/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Sobreposicao_de_Metodos_Area_Cilindro_13_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
        public static void main(String[] args) {
        Cilindro c = new Cilindro();
        Circulo c1 = new Circulo();
        System.out.println("Área do Cilindro = "+c.calcularArea(5));
        System.out.println("Área do Círculo = "+c1.calcularArea(3));
    }
}
