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
public class Bebida {
    private String nome;
    private String marca;
    
    public Bebida(){
        this.nome = "";
        this.marca = "";
    }
    
    public Bebida(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
