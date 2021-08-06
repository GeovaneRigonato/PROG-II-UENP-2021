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
public class Diarista extends Funcionario{
       private double salarioDia;
       private Integer diasTrabalhados;

    public Diarista(){
        salarioDia = 0;
        diasTrabalhados = 0;
    }
    
    public Diarista(double salarioDia, Integer diasTrabalhados){
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularSalario() {
       return salarioDia * diasTrabalhados;
    }
       
       
       
    
}
