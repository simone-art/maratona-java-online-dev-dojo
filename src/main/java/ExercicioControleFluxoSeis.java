public class ExercicioControleFluxoSeis {
    public static void main(String[] args) {
        //Imprima todos os números pares e impares de 0 até 100000

        int valor = 100000;
        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println("Este valor é par " + i);
            }else{
                System.out.println("Este valor é impar " + i);
            }
        }
    }
}
