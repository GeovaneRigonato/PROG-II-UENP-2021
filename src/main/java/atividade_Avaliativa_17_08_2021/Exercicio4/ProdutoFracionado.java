/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_17_08_2021.Exercicio4;

import atividade_Avaliativa_17_08_2021.Exercício1.Produto;
import atividade_Avaliativa_17_08_2021.Exercício2.IProduto;

/**
 *
 * @author geovane_rigonato
 */

/*Crie a classe concreta ProdutoFracionado, com os atributos quantidadeEstoque
(double). Considere que produtos fracionados são aqueles vendidos por peso, como
“Tomate”. O cliente pode comprar, por exemplo 1.2 kgs
a) A classe deve herdar de Produto e implementar a interface IProduto
b) A classe deve ter o método adicionarEstoque() , que recebe a quantidade a
ser adicionada ao estoque e retorna void
c) A classe deve ter o método vender( ) que recebe a quantidade vendida e
diminui da quantidadeEstoque

d) A classe deve implementar o método abstrato da interface. Calcular o valor
em estoque é multiplicar a quantidade em estoque pelo preço.
e) Crie construtores adequados.*/
public class ProdutoFracionado extends Produto implements IProduto {

    private double quantidadeEstoque;

    public ProdutoFracionado(Integer codigo, String nome, double preco, Integer quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public ProdutoFracionado() {
        this.quantidadeEstoque = 0;
    }

    public void adicionarEstoque(double quantidade) {
        this.quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void vender(double quantidadeVendida) {
        this.quantidadeEstoque -= quantidadeVendida;
    }

    public double calcularValorEmEstoque() {
        return this.quantidadeEstoque * getPreco();
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
