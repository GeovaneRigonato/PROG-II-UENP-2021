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
public class BebidasAlcoolicas extends Bebida{
    private double teorAlcoolico;
    
    public BebidasAlcoolicas(){
        super();
        this.teorAlcoolico = 0.0;
    }
    
    public BebidasAlcoolicas(String nome, String marca, double teor){
        super(nome, marca);
        this.teorAlcoolico = teor;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
    
}
