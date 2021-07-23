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
public class Suco extends Bebida{
    private String fruta;
    
    public Suco(){
        super();
        this.fruta = "";
    }
    
    public Suco(String nome, String marca, String fruta){
        super(nome, marca);
        this.fruta = fruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    
}
