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
public class Caminhao extends Veiculo {

    private int capacidadeDeCarga;

    public Caminhao(){
        super();
        capacidadeDeCarga = 0;
        
    }
    
    public Caminhao(String marca, Integer ano, Double valor, Integer capacidadeDeCarga){
       super(marca, ano, valor);
       this.capacidadeDeCarga = capacidadeDeCarga;
    }
    
    public String calcularIPVA() {

        if (2021 - getAno() > 20) {
            return "IPVA Isento";
        }return "IPVA: R$"+ getValor() * 0.04 ;
        }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        if(capacidadeDeCarga < 0){
            return;
        }
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    
    

}
