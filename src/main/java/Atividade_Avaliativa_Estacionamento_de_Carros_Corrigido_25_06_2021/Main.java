/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Avaliativa_Estacionamento_de_Carros_Corrigido_25_06_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */



public class Main {
    static Estacionamento estacionamento;
    private static final int TAM = 10;    
    public static void main(String[] args) {
        int opcao = 0;
        estacionamento = new Estacionamento();
        
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("Entrada de Carro --------> 1");
            System.out.println("Saida de Carro ----------> 2");
            System.out.println("Mostrar Estacionamento --> 3");
            System.out.println("Fechar programa ---------> 4");
            opcao = teclado.nextInt();
            
            switch (opcao){
                case 1 : entradaCarro();
                break;
                case 2 : saidaCarro();
                break;
                case 3 : mostrarCarros();
                break;
                case 4 : System.exit(0);
            }
        }
        
    }
 private static void entradaCarro(){
        Scanner teclado = new Scanner(System.in);
        int vaga = estacionamento.buscarVagaLivre();
        if(vaga == -1){
            System.out.println("\nLotado\n");
            return;
        }
        System.out.println("Vaga: " + vaga);
        System.out.println("Digite a placa: ");
        String placa = teclado.nextLine();
        estacionamento.ocuparVaga(vaga, placa);
        
}

private static void saidaCarro(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número da vaga: ");
    int numVaga = teclado.nextInt();
    System.out.println(estacionamento.calcularPagamento(numVaga));
    estacionamento.desocuparVaga(numVaga);
    
}

private static void mostrarCarros(){
    System.out.println("\n");
    for (int i = 0; i < TAM; i++) {
        System.out.println("Vaga: "+(i+1)+" -> "+estacionamento.getVagas()[i].getPlacaCarro());
        
    }System.out.println();
}
}
