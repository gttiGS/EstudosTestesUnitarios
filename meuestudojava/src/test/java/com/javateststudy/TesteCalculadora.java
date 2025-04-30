package com.javateststudy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.javastudy.Calculadora;

public class TesteCalculadora {
    
    //Test é uma notação, isso que faz o JUnit saber que é um teste
    @Test
    public void testSomaDoisValores(){

        Calculadora calculadora = new Calculadora();
        Integer total = calculadora.soma(5, 5);

        //Compara valor esperado com o valor total atual
        assertEquals(10, total);
        
    }

    @Test
    public void testeSomaDoisValoresNegativos(){
        Calculadora calc = new Calculadora();
        assertEquals(-10, calc.soma(-5, -5));
    }

    @Test
    public void testeSomaZero(){
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.soma(0, 0));
    }

    @Test
    public void testeNumerosPares(){
        Calculadora calc = new Calculadora();
        assertTrue(calc.isPar(2));
    }

    @Test
    public void testeNumerosImpares(){
        Calculadora calc = new Calculadora();
        assertFalse(calc.isPar(1));
    }

    @Test
    public void testeSubtracao(){
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sub(10, 5));
    }

    @Test
    public void testeDivisao(){
        Calculadora calc = new Calculadora();
        assertEquals(2.4975123f, calc.divisao(50.20f, 20.10f));
    }


}
