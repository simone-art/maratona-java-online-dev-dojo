package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;
import jdk.swing.interop.SwingInterOpUtils;

public class ProfesorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José Carlos";
        professor.matricula = "3344";
        professor.rg = "75432176";
        professor.cpf = "111.222.333-44";
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        System.out.println("=====================");
        Professor professor1 = new Professor();
        professor1.nome = "Patricia";
        professor1.matricula = "4465";
        professor1.rg = "88889990";
        professor1.cpf = "555.666.777-22";
        System.out.println(professor1.nome);
        System.out.println(professor1.matricula);
        System.out.println(professor1.rg);
        System.out.println(professor1.cpf);
    }
}
