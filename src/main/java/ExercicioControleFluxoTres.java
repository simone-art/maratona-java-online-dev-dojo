public class ExercicioControleFluxoTres {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100000
        //1.Definir uma variável
        //2.Definir um for

        int listaNumero = 100000;
        for (int i = 0; i <= listaNumero; i++) {
            if (i % 2 != 0) {
                System.out.println("Este valor é impar " + i);
            }
        }
    }
}

