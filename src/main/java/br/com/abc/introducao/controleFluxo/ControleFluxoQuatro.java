package br.com.abc.introducao.controleFluxo;

public class ControleFluxoQuatro {
    public static void main(String[] args) {
        /*
        Controle de fluxo for, while, do while
        While: comando que repite a instrução enquanto ela for verdadeira
        While precisa de um valor booleano
        Se não colocar a variável++, o while entra num loop infinito
        e deve estar dentro do bloco de instrução;
        Se usar o contador++, o programa imprime do 0 ao 9.
        Se usar o ++contador, o programa imprime do 1 ao 10.
        Do While: Executa uma vez, independentemente que seja verdadeiro o falso
        //For se usa quando o tamanho da interação está definida. se sabe
        //Quantas vezes ser;a executado ese bloco de código
        //Brreak pode ser usado no switch, do, while e for
         */
        int contador = 11;
        while (contador < 10) {
            System.out.println(++contador);
            //contador++;
        }
        do {
            System.out.println("Dentro do do while");
        } while (contador < 10);
        //i é uma variável local
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}