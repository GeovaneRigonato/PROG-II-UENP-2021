/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_Avaliativa_04_11_2021;

/**
 *
 * @author geovane
 */
public class Pilha {
   
    static Pessoa pilha[] = new Pessoa[5];
    static int topo = -1;

    //insercao no topo da pilha
    public void empilha(Pessoa p){
        //insere no vetor
        if (topo == -1 || topo < (pilha.length-1)){
            //vetor vazio
            topo++;
            pilha[topo] = p;
        }else{
            System.out.println("....Pilha Cheia....");
        }
    }

    //imprime pilha
    public void imprimePilha(){
        System.out.println("-----IMPRIME Pilha-------");
        for (int i = 0; i <= topo; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ pilha[i].toString());
        }
    }

    //remove do topo da pilha
    public Pessoa desempilha() throws ExcecaoPilhaVazia{
         if(topo !=-1) {
            Pessoa temp = pilha[topo];
            pilha[topo] = null;
            topo = topo-1;
            return temp;
        }
        else {
            throw new ExcecaoPilhaVazia();
        }
    }
}