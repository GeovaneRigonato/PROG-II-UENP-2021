/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Avaliativa_Estacionamento_de_Carros_Errado_25_06_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
     static Carro[] estacionamento = new Carro[2]; //Vetor estacionamento
    static int pont_ultimo = -1;

    public static void mostrarCarros() {
        for (int i = 0; i < pont_ultimo+1; i++) {
            System.out.println("Carro " + i + " -> " + "Placa: "+ estacionamento[i].getPlacaCarro() + " Hora de entrada: "+ estacionamento[i].getEntrada());
        }
    }

    public boolean buscarCarros(){
        boolean temCarros = false;
        for (int i = 0; i < estacionamento.length; i++) {
                if(estacionamento[i] != null){
                    temCarros = true;

                }
        }
        return temCarros;
    }

    public static void valor(String saida, String entrada){
        int totalPagar = 0;
        int entradaCarro = Integer.parseInt(entrada.split(":")[0]);
        int saidaCarro = Integer.parseInt(saida.split(":")[0]);
        int minutos = Integer.parseInt(saida.split(":")[1]);

        if((saidaCarro - entradaCarro) == 1){
            totalPagar = 5;
        }else if((saidaCarro - entradaCarro) >=1 && minutos > 0){
            totalPagar = 5 * ((saidaCarro-entradaCarro)+1);
        }
        System.out.println("Valor a pagar: R$ " + totalPagar);
    }

    public static void inserirFinal(Carro c) {
        if (pont_ultimo + 1 < estacionamento.length) {
            pont_ultimo++;
            estacionamento[pont_ultimo] = c;
        }else if(pont_ultimo+1 == estacionamento.length){
            System.out.println("Lotado");
        }
    }
    public static int buscarCarro(String placa) {
        for (int i = 0; i <= pont_ultimo; i++) {
            if (estacionamento[i].getPlacaCarro().equals(placa)) {
                return i;
            }
        }
        return 0;
    }

    public static Carro remover(String placa) {
        int pos_remover = buscarCarro(placa);
        if (pos_remover != -1) {
            Carro removido = estacionamento[pos_remover];
            for (int i = pos_remover; i < pont_ultimo; i++) {
                estacionamento[i] = estacionamento[i + 1];//deslocamento dos elementos
            }
            estacionamento[pont_ultimo] = null;
            pont_ultimo--;
            return removido;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

        System.out.println("Adicionar carro -> 1");
        System.out.println("Mostrar lista de carros -> 2");
        System.out.println("Remover carro ->3");
        int n = teclado.nextInt();
        if(n == 1){

                System.out.print("Placa: ");
                Carro c = new Carro(teclado.next());
                System.out.print("Hora de entrada: ");
                c.setEntrada(teclado.next());
                inserirFinal(c);

                System.out.println();

        }
        else if(n == 2){
            mostrarCarros();
            System.out.println();
        }else if(n == 3){
            System.out.print("Digite a placa: ");
            remover(teclado.next());
            System.out.printf("Hora de saída e entrada: ");
            valor(teclado.next(), teclado.next());

        }


    }
    }
}
