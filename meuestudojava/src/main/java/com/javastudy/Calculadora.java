package com.javastudy;

public class Calculadora {

    public Integer soma(Integer valor01, Integer valor02){
        Integer total = valor01 + valor02;
        return total;
    }

    public boolean isPar(int numero){
        return numero % 2 == 0;
    }
    
    public Integer sub(Integer valor01, Integer valor02){
        Integer total = valor01 - valor02;
        return total;
    }

    public Float divisao(Float valor01, Float valor02){
        Float total = valor01 / valor02;
        return total;
    }
    
}
