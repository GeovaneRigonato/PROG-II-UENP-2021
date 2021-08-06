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


public class FolhaPagamento {
    
    public static final int TAM = 8;
    
    public static void main(String[] args) {
        Funcionario lista[] = new Funcionario[TAM];
        lista[0] = new Diarista(25.0, 30);
        lista[1] = new Diarista(35.0, 15);
        lista[2] = new Diarista(40.0, 25);
        lista[3] = new Diarista(45.0, 30);
        lista[4] = new Gerente(2_500.0);
        lista[5] = new Gerente(3_500.0);
        lista[6] = new Gerente(4_500.0);
        lista[7] = new Gerente(5_500.0);
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("R$: "+lista[i].calcularSalario());
            
        }
    }
}
