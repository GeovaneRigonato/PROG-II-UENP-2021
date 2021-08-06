/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_Impressão_de_linhas_25_05_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas a serem impressas: ");
        int quantidade = teclado.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.print("_");
        }
        System.out.println("\n\n");
    }
}
