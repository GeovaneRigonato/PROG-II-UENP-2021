/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_17_08_2021.Exercício1;

import atividade_Avaliativa_17_08_2021.Exercício2.IProduto;

/**
 *
 * @author geovane_rigonato
 */

/*
Crie uma classe abstrata chamada Produto com dois atributos codigo (inteiro) e
nome (texto), preco (double)
a) A classe deve sobrescrever o método toString() para retornar o código e
nome do produto. Exemplo: “12 - Tomate”
b) Crie construtores adequados
 */
public abstract class Produto implements Comparable,IProduto{

    private Integer codigo;
    private String nome;
    private double preco;

    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.preco = 0;
    }

    public Produto(Integer codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    
    @Override
    public int compareTo(Object o){
        Produto p = (Produto ) o;
        return (codigo - p.getCodigo());
    }
    
    public String toString() {
        return codigo + " - " + nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
