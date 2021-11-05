/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_Avaliativa_04_11_2021;

/**
 *
 * @author geovane
 */

public class Pessoa {

    String nome;
    int idade;

    public Pessoa (String n, int i){
        nome = n;
        idade = i;
    }

    public String toString(){
        return "Nome: "+nome+" idade: "+idade;
    }
}