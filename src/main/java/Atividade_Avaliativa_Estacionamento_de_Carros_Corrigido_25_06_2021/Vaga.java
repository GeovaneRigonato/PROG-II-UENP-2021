/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Avaliativa_Estacionamento_de_Carros_Corrigido_25_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Vaga {
    private Integer numeroVaga;
    private Boolean livre;
    private String placaCarro;
    private Long entradaCarro;
    
    public Vaga(){
        numeroVaga = 0;
        livre = true;
        placaCarro = "";
        entradaCarro = 0L;
    }
    
    public Vaga(Integer numeroVaga){
        this.numeroVaga = numeroVaga;
        this.livre = true;
        placaCarro = "";
        entradaCarro = 0L;
    }
    
    public void ocuparVaga(String placa){
        this.placaCarro = placa;
        this.livre = false;
        this.entradaCarro = System.currentTimeMillis();
    }
    
    public void desocuparVaga(){
        this.placaCarro = "";
        this.livre = true;
        this.entradaCarro = 0L;
    }

    public Integer getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(Integer numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public Boolean getLivre() {
        return livre;
    }

    public void setLivre(Boolean livre) {
        this.livre = livre;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public Long getEntradaCarro() {
        return entradaCarro;
    }

    public void setEntradaCarro(Long entradaCarro) {
        this.entradaCarro = entradaCarro;
    }
    
    
}