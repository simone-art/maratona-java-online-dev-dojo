package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.substracaoDoisNumeros();
        calculadora.multiplicarDoisNumeros(5, 3);
        double resultado = calculadora.divideDoisNumeros(30,5);
        calculadora.imprimeResultadoDoisNumeros(20,5);
        System.out.println("O resultado da divisão e: " + resultado);
    }
}
