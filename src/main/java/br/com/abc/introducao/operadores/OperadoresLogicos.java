package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    public static void main (String[] args){
        int idade = 18;
        float salario = 1000f;
        System.out.println(idade >= 18 && salario >= 1000f);
        System.out.println(idade >= 18 && salario >= 3000f);
        System.out.println(idade >= 18 || salario >= 3000f);
        //Com o ||, uma das condições tem que ser verdadeiras
        //Com o &&, as duas condições tem que ser verdadeiras para se cumplir.
    }
}
