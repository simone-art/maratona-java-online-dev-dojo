public class ControleFluxoQuatro {
    public static void main(String[] args) {
        /*
        Controle de fluxo for, while, do while
        While: comando que repite a instrução enquanto ela for verdadeira
        While precisa de um valor booleano
        Se não colocar a variável++, o while entra num loop infinito
        e deve estar dentro do bloco de instrução;
         */
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }
    }
}
