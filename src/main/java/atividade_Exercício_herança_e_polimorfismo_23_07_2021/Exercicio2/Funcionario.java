/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio2;

/**
 *
 * @author geovane_rigonato
 */
public abstract class Funcionario {
    private double salarioMes;
    
    public Funcionario(){
        salarioMes = 0;
    }
    
    public Funcionario(double salarioMes){
        this.salarioMes = salarioMes;
    }
    
    public abstract double calcularSalario();
    
}