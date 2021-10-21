package atividade_Exercício_HashMap_19_10_2021;

/**
 *
 * @author geova
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Supermercado {

    public static Double retornaPrecoNome(String nome, HashMap<String, Double> supermercado){
        for(Entry e : supermercado.entrySet()){
            if (e.getKey() == nome){
                Double atual = (Double) e.getValue();
                return atual;
            }
        }
        return null;
    }

    public static Double ProdutoCaro(HashMap<String, Double> supermercado){
        final HashMap<String, Double> ordenados = supermercado.entrySet()
                .stream()
                .sorted(HashMap.Entry.comparingByValue())
                .collect(Collectors.toMap(HashMap.Entry::getKey,
                        HashMap.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Double maior = null;
        for(Entry e : ordenados.entrySet()){
            maior = (Double) e.getValue();
        }
        return maior;
    }

    public static void main(String[] args) {

        HashMap<String, Double> supermercado = new HashMap<>();
        supermercado.put("Macarrao", 5.00);
        supermercado.put("Feijao", 8.10);
        supermercado.put("Arroz", 7.48);
        supermercado.put("Abobora", 3.98);
        

        System.out.println("Preço pelo nome: R$"+retornaPrecoNome("Macarrao", supermercado)); 

        System.out.println("Produto mais caro: R$"+ProdutoCaro(supermercado));
    }
}