/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Avaliativa_Máquina_de_Café_08_06_2021;

/**
 *
 * @author geovane_rigonato
 */
public class Cartao {
    private int numCartao;
    private int saldoCartao = 10;

    public Cartao(int numCartao) {
        this.numCartao = numCartao;
    }

public void adicionarSaldo(){
    this.saldoCartao = saldoCartao + 1;
}

public void retirarCafe(){
    if(saldoCartao > -1){
        this.saldoCartao = saldoCartao - 1;
    }else{System.out.println("Saldo insuficiente!");
    }
}

    public int getNumCartao() {
        return numCartao;
    }

    public int getSaldoCartao() {
        return saldoCartao;
    }
    
}
