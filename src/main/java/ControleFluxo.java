public class ControleFluxo {

    /**
     * Estruturas condicionais If e Else
     * If e else são muito usadas porque elas fazem obedecer as regras de negócio que o cliente precisa
     * Dentro do parentêsis sempre vai uma condição booleana
     */
    public static void main(String[] args) {
        // O if só entra na condição quando ela é verdadeira
//        int idade = 20;
//        float salario = 2000;
//        if (idade >= 18 && salario >= 2000) {
//            System.out.println("Você está dentro do clube dos DEV Jr.");
//        } else {
//            System.out.println("Você não está dentro do clube dos DEV Jr!");
//        }
//    }

        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 Juvenil
        // idade >= 18 Adulto
        int idade = 15;
        if (idade < 15) {
            System.out.println("Você pertence a categoría infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Você pertence a categoría Juvenil");
        } else {
            System.out.println("Você pertence a categoría adulto");

        }
    }
}