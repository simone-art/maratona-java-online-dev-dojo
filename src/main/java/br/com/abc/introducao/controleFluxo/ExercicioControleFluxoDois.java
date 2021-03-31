package br.com.abc.introducao.controleFluxo;

public class ExercicioControleFluxoDois {
    public static void main(String[] args) {
        /*
        Cria um switch que dado um valor de 1 até 7,
        considerando o valor 1 igual a domingo,
        imprima se é día útil ou final de semana
         */

        byte diaUtil = 1;
        switch (diaUtil) {
            case 1:
                System.out.println("Hoje é domingo, final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda, día útil");
                break;
            case 3:
                System.out.println("Hoje é terça, día útil");
                break;
            case 4:
                System.out.println("Hoje é quarta, día útil");
                break;
            case 5:
                System.out.println("Hoje é quinta, día útil");
                break;
            case 6:
                System.out.println("Hoje é sexta, día útil");
                break;
            case 7:
                System.out.println("Hoje é sábado, final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
