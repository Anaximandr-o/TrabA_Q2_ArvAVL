package com.antonioProjeto;
import java.util.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {Random gerador = new Random();
        for(int i = 0; i < 100; i++){
            int qtdNos = gerador.nextInt(100, 1000);
            DescriptiveStatistics stats = new DescriptiveStatistics();
            for(int x = 0; x <100; x++){
                ArvAVL arvore = new ArvAVL();
                for(int j = 0; j < qtdNos; j++){
                    int no = gerador.nextInt(100,1000000);
                    arvore.put(no, no);
                }
                arvore.removeLaura(qtdNos);
                stats.addValue(arvore.altura());
            }
            System.out.println("Quantidade de nós - "+ qtdNos + " Altura esperada - " + ((Math.log(qtdNos)/Math.log(2)) * 4.311 - 1.953) +" Média das alturas - "+ stats.getMean() + " Desvio padrão: " + stats.getStandardDeviation());
        }
    }
}