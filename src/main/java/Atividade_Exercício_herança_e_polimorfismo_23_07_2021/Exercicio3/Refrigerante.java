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
public class Refrigerante extends Bebida{
    private String sabor;
    
    public Refrigerante(){
        super();
        this.sabor = "";
    }
    
    public Refrigerante(String nome, String marca, String sabor){
        super(nome, marca);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    
}
