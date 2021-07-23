/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio2;

/**
 *
 * @author geovane_rigonato
 */
public class Gerente extends Funcionario{
    private double salarioMes;
    
    
    public Gerente(){
        salarioMes = 0;
    }
    
    public Gerente(double salarioMes){
        this.salarioMes = salarioMes;
    }
    
    public double calcularSalario(){
        return salarioMes  = salarioMes +(salarioMes*0.1);
    }
}
