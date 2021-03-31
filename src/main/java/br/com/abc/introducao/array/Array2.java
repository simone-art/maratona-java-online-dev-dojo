package br.com.abc.introducao.array;

public class Array2 {
    public static void main(String[] args) {

        //Usando byte, short, int, long, float, double = 0 / zero valor por padrão
        //Usando o char o valor é o unicode se será impreso espaço em branco
        //En booleanos, o valor será false;
        //reference(string) será null; array de objetos é nulo
        String [] nomes = new String[3];
        nomes [0] = "Maria";
        nomes [1] = "Rogerio";
        nomes [2] = "Simone";
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes: " + nomes[i]);
        }

    }
}
