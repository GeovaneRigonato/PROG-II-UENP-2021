/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio1;

/**
 *
 * @author geovane_rigonato
 */
public class TestarHerança {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("AAA-1113","Hyundai", 2021, 76_000.0);
        Veiculo veiculo1 = new Veiculo("AAA-0000","Chevrolet", 2021, 137_000.0);
        Caminhao caminhao = new Caminhao("AAA-1113","Scania", 2020, 595_000.0, 100);
        System.out.println(caminhao.calcularIPVA());
        System.out.println(veiculo.getPlaca().equals(veiculo1.getPlaca()));
        System.out.println(veiculo.getPlaca().equals(caminhao.getPlaca()));
     // System.out.println(veiculo.calcularIPVA()); -> Não funciona, pois o método calcularIPVA pertence a classe Caminhao
    }
}
