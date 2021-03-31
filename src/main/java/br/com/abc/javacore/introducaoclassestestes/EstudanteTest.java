package br.com.abc.javacore.introducaoclassestestes;

import br.com.abc.javacore.introducaoclasses.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Joao";
        estudante.matricula = "1212";
        estudante.idade = 18;
        System.out.println(estudante.nome);
        System.out.println(estudante.matricula);
        System.out.println(estudante.idade);
    }
}
