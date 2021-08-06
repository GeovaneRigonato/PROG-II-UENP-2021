/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_Estacionamento_de_Carros_Errado_25_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Carro {
       private String placaCarro;
    private String entrada;
    private String saida;

    public Carro() {

    }


    public String getEntrada() {
        return this.entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public Carro(String placaCarro){
        this.placaCarro = placaCarro;
    }

    public void setPlacaCarro(String placa){
        this.placaCarro = placa;
    }

    public String getPlacaCarro(){
        return this.placaCarro;
    }
}
