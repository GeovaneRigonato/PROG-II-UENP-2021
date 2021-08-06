/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Sobreposicao_de_Metodos_Area_Cilindro_13_07_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Cilindro extends Circulo{
    private float altura;

    @Override
    public float calcularArea(double altura){
        setRaio(3);
        return (float) (2*(Math.PI*(getRaio()*getRaio()))+2*(Math.PI*(getRaio()*altura)));
    }

}
