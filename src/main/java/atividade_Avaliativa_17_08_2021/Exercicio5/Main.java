/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_17_08_2021.Exercicio5;

import atividade_Avaliativa_17_08_2021.Exercicio3.ProdutoUnitario;
import atividade_Avaliativa_17_08_2021.Exercicio4.ProdutoFracionado;
import atividade_Avaliativa_17_08_2021.Exercício1.Produto;

import atividade_Avaliativa_17_08_2021.Exercício2.IProduto;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author geovane_rigonato
 */
public class Main{
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        Produto   p = new ProdutoUnitario(6, "leite - 1L", 1.98, 10);
        Produto p1 = new ProdutoUnitario(3, "Óleo - 900ml", 7.5, 15);
        Produto p2 = new ProdutoUnitario(2, "Achocolatado em Pó Toddy - 400g", 5.5, 8);
        Produto p3 = new ProdutoFracionado(8, "Maçã", 3.39, 39);
        Produto p4 = new ProdutoFracionado(1, "Pera", 4, 43);
        Produto p5 = new ProdutoFracionado(12, "Banana", 2.25, 69);

        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        Collections.sort(lista);
        double valorTotal = 0;
        for(Produto aux : lista){
            valorTotal = valorTotal + aux.calcularValorEmEstoque();
        }
        
        for (Produto aux : lista) {
            System.out.println(aux.toString() + " R$ " + aux.calcularValorEmEstoque());
        }
        
        System.out.println("\nValor total em estoque: R$ " + valorTotal);

    }

}
