/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Herança_Caminhão_06_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class TestarHerança {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Hyundai", 2020, 58_000.0);
        Caminhao caminhao = new Caminhao("Scania", 2020, 595_000.0, 100);
        System.out.println(caminhao.calcularIPVA());
     // System.out.println(veiculo.calcularIPVA()); -> Não funciona, pois o método calcularIPVA pertence a classe Caminhao
    }
}
