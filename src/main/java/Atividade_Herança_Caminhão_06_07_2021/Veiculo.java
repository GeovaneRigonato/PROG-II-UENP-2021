/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Herança_Caminhão_06_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Veiculo {
        private String marca;
    private Integer ano;
    private Double valor;

    public Veiculo(){
        this.marca = "";
        this.ano = 0;
        this.valor = 0.0;
    }

    public Veiculo(String marca, Integer ano, Double valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
