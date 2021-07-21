/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Sobreposicao_de_Metodos_Area_Cilindro_13_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Circulo {
    private double raio;

    public float calcularArea( double raio){
        this.raio = raio;
        return (float) (Math.PI*(raio*raio));
    }

    public float getRaio() {
        return (float) raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }}