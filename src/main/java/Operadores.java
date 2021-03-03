public class Operadores {

    public static void main (String[] args){
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero2 / numero1;
        int subtracao = numero1 - numero2;
        int resto = 20%2;
        // assim vai ser printado na tela 1020 e não 30 porque o signo + concatenou as variáveis
        //System.out.println("A somatoria é: " + numero1 + numero2);
        //O correto é:
        System.out.println("A somatoria é: " + soma);
        System.out.println("A somatoria é: " + (numero1 + numero2));
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        System.out.println("A subtração é: " + subtracao);
        //Resto de divisão se calcula com o signo de %
        System.out.println("O resto é: " + resto);

    }

}
