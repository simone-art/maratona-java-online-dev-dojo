package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {
        // br.com.abc.introducao.operadores.Operadores de atribuição: =, -=, +=, *=, /=, %=
        //São feitos para poupar linha de código
        int salario = 2000;
        //Para acrescentar mas 1000 reais no salário, o código sería assim:
        //salario = salario + 1000;
        //salario += 1000;// Menos código escrito. Muito usado em laços de repetição
        //salario *= 0.1;
        salario = salario + (int) (salario * 0.1);
        //Neste código foi colocado o int para forzar o
        //programa a fazer a somatoria
        //System.out.println(salario);
        System.out.println(salario);
    }
}
