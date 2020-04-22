package org.example.v11;

import java.util.function.Function;

public class InferenciaLambda {

    public static void main(String[] args) {
        Function<Integer, Double> divisao = (var numero) -> numero / 2d;
        System.out.println(divisao.apply(6));
    }
}
