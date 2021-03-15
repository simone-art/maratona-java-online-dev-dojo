public class ExercicioControleFluxoCinco {
    //Dado um determinado salário, se o salário foi maior que 4.500,
    //imprima 30% do valor. Senão imprima 15

    public static void main(String[] args) {
        double salario = 4500;

        if (salario > 4500){
            double resultado = salario * 30 / 100;
            System.out.println("O valor do imposto do seu salário é: " + resultado);
        }else {
            double resultado = salario * 15 / 100;
            System.out.println("O valor do imposto do seu salário é: " + resultado);
        }
    }

}
