/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio1;

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
    
    public Caminhao(String placa, String marca, Integer ano, Double valor, Integer capacidadeDeCarga){
       super(placa, marca, ano, valor);
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
