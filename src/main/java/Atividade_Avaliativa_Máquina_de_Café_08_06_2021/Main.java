
package Atividade_Avaliativa_Máquina_de_Café_08_06_2021;

/**
 *
 * @author geovane_rigonato
 */
  import java.util.Scanner;

    /*Café é um produto muito apreciado por programadores. Sabendo disso, a empresa
 ProgExpress lançou uma máquina de café que trabalha com cartões pré-pagos. O sistema funciona da seguinte maneira:
 o cliente adquire um cartão, inicialmente com 10 unidades (10 cafés). A cada café retirado da máquina, o saldo do cartão
 é decrementado. O cliente pode comprar mais cafés (carregar o cartão) com uma quantidade qualquer de unidades.

Faça um programa que simule cartões (apenas o cartão, não a máquina). Deverá
        haver, no mínimo, a classe Cartao e uma
        outra classe, com o método main( ), em que seja simulada a criação de um cartão e as
        chamadas aos métodos.
        O critério de avaliação será:
        1 Correta identificação de atributos e métodos
        2 Correta escrita de construtores
        3 Adequação na definição de parâmetros dos métodos e tipo de retorno

        Observações:
        1 O saldo do cartão nunca pode ficar negativo
        2 Não é necessário “inventar” nada além do mínimo que está na descrição acima.*/
public class Main {
        public static void main(String[] args) {
            Cartao c1 = new Cartao(458795412);
            c1.adicionarSaldo();
            c1.adicionarSaldo();
            System.out.println("Cartão de número -> "+c1.getNumCartao()+" Saldo: "+c1.getSaldoCartao());
            c1.retirarCafe();
            System.out.println("Cartão de número -> "+c1.getNumCartao()+" Saldo: "+c1.getSaldoCartao());
    }
    
}
