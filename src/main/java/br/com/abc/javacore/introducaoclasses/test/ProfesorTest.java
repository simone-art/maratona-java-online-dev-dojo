package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;
import jdk.swing.interop.SwingInterOpUtils;

public class ProfesorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José Carlos";
        professor.matricula = "Geografía";
        professor.rg = "75432176";
        professor.cpf = "11122233344";
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
