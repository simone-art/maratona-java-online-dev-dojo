public class RelatorioTrabalhador {
    /**
     *
     * Crie um algoritmo que possua variáveis pra salvar os seguintes dados:
     * sálario, sexo (M ou F), idade e estado civil.
     * Imprima  da seguinte forma:
     * 0 trabalhador (A) <nome> do sexo <sexo>, idade <idade> e salario <salario>
     *     encontra-se empregado neste estabelecimento.
     */

    public static void main (String [] arsg){
        String nome = "Rogerio Ferreira";
        double salario = 4000;
        String sexo = "masculino";
        int idade = 30;
        System.out.println("O trabalhador (A) " + nome + " do sexo " + sexo + ","
                + " idade " + idade + "," + " e salario "
                + salario + "," + " encontra-se empregado neste estabelecimento. ");
    }
}
