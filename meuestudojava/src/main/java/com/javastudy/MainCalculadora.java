package com.javastudy;

public class MainCalculadora {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora ();

        Integer total = calc.soma(8, 10);

        System.out.println("O total da soma é " +total);

        int[] numeros = {2, 3, 4, 5, 6};

        for (int numero : numeros) {
            if (calc.isPar(numero)) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }

        Integer totalsub = calc.sub(15, 10);

        System.out.println("O total da subtração é " +totalsub);

        Float totaldiv = calc.divisao(50.20f, 20.10f);

        System.out.println("O total da divisão é " +totaldiv);

    }
    
}
