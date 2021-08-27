/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_17_08_2021.Exercicio3;

import atividade_Avaliativa_17_08_2021.Exercício1.Produto;
import atividade_Avaliativa_17_08_2021.Exercício2.IProduto;

/**
 *
 * @author geovane_rigonato
 */

/*Crie a classe concreta ProdutoUnitario, com o atributo quantidadeEstoque (inteiro).
Considere que produtos unitários são aqueles vendidos por unidade, como “Leite
longa vida 1 litro”
a) A classe deve herdar de Produto e implementar a interface IProduto
b) A classe deve ter o método adicionarEstoque() , que recebe a quantidade a
ser adicionada ao estoque e retorna void
c) A classe deve ter o método vender( ) que recebe a quantidade vendida e
diminui da quantidadeEstoque
d) A classe deve implementar o método abstrato da interface. Calcular o valor
em estoque é multiplicar a quantidade em estoque pelo preço.
e) Crie construtores adequados.*/
public class ProdutoUnitario
        extends Produto implements IProduto {

    private Integer quantidadeEstoque;

    public ProdutoUnitario(Integer codigo, String nome, double preco, Integer quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public ProdutoUnitario() {
        this.quantidadeEstoque = 0;
    }

    public void adicionarEstoque(Integer quantidade) {
        this.quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void vender(Integer quantidadeVendida) {
        this.quantidadeEstoque -= quantidadeVendida;
    }

    public double calcularValorEmEstoque() {
        return this.quantidadeEstoque * getPreco();
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

}
