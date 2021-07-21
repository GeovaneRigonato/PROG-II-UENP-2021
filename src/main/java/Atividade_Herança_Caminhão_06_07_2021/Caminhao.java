/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Herança_Caminhão_06_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Caminhao extends Veiculo{
        private int capacidadeDeCarga;

    public String calcularIPVA(){
        setAno(2019);
        setValor(20000.0);
        float ipva = 0;
        if(getAno() > 2001) {
            ipva = (float) (getValor() * 0.04);
            return "IPVA = R$ " + ipva;
        }else{
            return "IPVA Isento";
        }

    }

}
