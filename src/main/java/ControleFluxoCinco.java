public class ControleFluxoCinco {

    //programa que dado um valor de um carro, determina a quantidades de parcelas possiveis a pagar
    //tendo em conta que as parcelas não podem ser menores do que 1000 reais
    public static void main(String[] args) {

        double valorTotalCarro = 30000;
        for(int parcela = 1; parcela <= valorTotalCarro; parcela++) {
           double valorParcela = valorTotalCarro / parcela;
           if (valorParcela >= 1000){
               System.out.println("Parcela " + parcela + " RS " + valorParcela);
           }else{
               System.out.println("Saindo do laço");
               break;
           }
            System.out.println("Fora do if");
        }

    }
}
