public class ImprimindoVariaveis {

    // Voce pode comentar o que quiser
    /*
    Comentários são necessários
     */

    /***
     * Esse e o metodo main
     * @param args parametro de entrada do metodo Main
     */
    //Cada um dos tipos de variáveis tem um espaço determinado na memoria
    public static void main (String[] args){
        int idade = 10;
        System.out.println("A idade da pessoa é: " + idade + " anos");
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caracter = '\u0041'; //Alocação de 2 bytes
        String nome = "Simone";  //Não é primitivo mas é muito usado
        System.out.println(nome + " de idade " + idade);
        System.out.println(caracter);

    }
}
