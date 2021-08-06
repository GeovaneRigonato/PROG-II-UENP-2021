/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Igualdade_Retângulos_18_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Retangulo {
    private int lado1;
    private int lado2;


    public Retangulo() {
        this.lado1 = 5;
        this.lado2 = 5;
    }

   public Retangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(int n){
        this.lado1 = n;
    }
    public int getLado1(){
        return this.lado1;
    }
    public void setLado2(int n){
        this.lado2 = n;
    }
    public int getLado2(){
        return this.lado2;
    }

    public static String verificarIgualdade(Retangulo n){
        if(n.lado1 == n.lado2){
            return "Verdadeiro";
        }else{
            return "Falso";
        }
    }
    
}
