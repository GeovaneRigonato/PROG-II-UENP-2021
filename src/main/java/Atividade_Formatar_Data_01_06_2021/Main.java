/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_Formatar_Data_01_06_2021;

import java.util.Scanner;

/**
 *
 * @author geovane_rigonato
 */
public class Main {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a forma de separação: ");
        String n = teclado.nextLine();

        Data data1 = new Data();
        Data data2 = new Data(2021);
        Data data3 = new Data(1,6,2021);
        System.out.println(data1.formatarData(n));
        System.out.println(data2.formatarData(n));
        System.out.println(data3.formatarData(n));
    }
}
