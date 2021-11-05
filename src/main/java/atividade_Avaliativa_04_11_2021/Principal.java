/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_Avaliativa_04_11_2021;

/**
 *
 * @author geovane
 */
public class Principal {
    public static void main(String[] args) throws ExcecaoPilhaVazia {
        Pilha p = new Pilha();

        Pessoa p1 = new Pessoa("Paulo",40);
        Pessoa p2 = new Pessoa("Giovana",30);
        Pessoa p3 = new Pessoa("Paula",25);
        Pessoa p4 = new Pessoa("Junior",15);
        Pessoa p5 = new Pessoa("Camila",45);

        p.empilha(p1);
        p.empilha(p2);
        p.imprimePilha();
        p.empilha(p3);
        p.empilha(p4);
        p.empilha(p5);
        p.imprimePilha();

        
        
        p.desempilha();
        p.desempilha();
        p.desempilha();
        p.desempilha();
        p.desempilha();
        

        p.imprimePilha();
        
        p.desempilha();
        p.desempilha();


    }
}
