/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_Estacionamento_de_Carros_Corrigido_25_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Estacionamento {
    private Vaga[] vagas;
    private static final int TAM = 10;

    public Estacionamento(){
        vagas = new Vaga[TAM];
        for (int i = 0; i < TAM; i++) {
            vagas[i] = new Vaga (i+1);
        }
    }
    
    public int buscarVagaLivre(){
        for (int i = 0; i < TAM; i++) {
            if(vagas[i].getLivre() == true){
                return(vagas[i].getNumeroVaga());
            }
        }return -1;
    }
    
    public void ocuparVaga(int numeroVaga, String placa){
        this.vagas[numeroVaga-1].ocuparVaga(placa);
    }
    
    public void desocuparVaga(int numeroVaga){
        this.vagas[numeroVaga-1].desocuparVaga();
    }
    
    public String calcularPagamento(int numeroVaga){
        long saida = System.currentTimeMillis();
        long tempo = saida -vagas[numeroVaga-1].getEntradaCarro();
        double minutos = (double) tempo / 1000 / 60;
        double arredondado = Math.ceil(minutos);
        return "Total a pagar -> R$: " + arredondado * 5.0;
    }
    
    
    public Vaga[] getVagas() {
        return vagas;
    }

    public void setVagas(Vaga[] vagas) {
        this.vagas = vagas;
    }
    
}
