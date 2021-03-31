package br.com.abc.introducao.controleFluxo;

import jdk.swing.interop.SwingInterOpUtils;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Defina uma variavel e cria uma tabela salário usando if e else
        para calcular o imposto a ser pago:
        salario < 1000 = 5% do salário
        salario >= 1000 && salario < 2000 = 10%
        salario >= 2000 && salario < 4000 = 15%
        salario >= 5000  = 20%

         */
        double salario = 6000;
        double porcentagemPagoImposto;

        if (salario < 1000){
            porcentagemPagoImposto = salario * 5 / 100;
            System.out.println("O pago do imposto tem um valor de: " + porcentagemPagoImposto);
        }else if(salario >= 1000 && salario < 2000){
            porcentagemPagoImposto = salario * 10 / 100;
            System.out.println("O pago do imposto tem um valor de: " + porcentagemPagoImposto);
          }else if(salario >= 2000 && salario < 4000){
            porcentagemPagoImposto = salario * 15 / 100;
            System.out.println("O pago do imposto tem um valor de: " + porcentagemPagoImposto);
        } else if(salario >= 5000 ){
            porcentagemPagoImposto = salario * 20 / 100;
            System.out.println("O pago do imposto tem um valor de: " + porcentagemPagoImposto);
        }
    }
}
