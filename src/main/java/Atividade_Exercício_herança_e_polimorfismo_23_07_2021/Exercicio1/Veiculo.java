/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Exercício_herança_e_polimorfismo_23_07_2021.Exercicio1;

/**
 *
 * @author geovane_rigonato
 */
public class Veiculo {
    private String placa;
    private String marca;
    private Integer ano;
    private Double valor;


    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.ano = 0;
        this.valor = 0.0;
    }

    public Veiculo(String placa, String marca, Integer ano, Double valor) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
