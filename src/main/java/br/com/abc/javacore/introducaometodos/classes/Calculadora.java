package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        int numA = 5;
        int numB = 3;
        int resultado = numA + numB;
        System.out.println("A soma é:" + resultado);
    }

    public void substracaoDoisNumeros() {
        int numA = 5;
        int numB = 3;
        int resultado = numA - numB;
        System.out.println("A substração é: " + resultado);
    }

    //Métodos com parámetros

    public void multiplicarDoisNumeros(int numA, int numB) {
        int resultado = numA * numB;
        System.out.println("A multiplicação é: " + resultado);

    }

    //Métodos com retorno
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else
            return 0;
    }

    public void imprimeResultadoDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Não é possível dividir por Zero");
        }

    }


}
