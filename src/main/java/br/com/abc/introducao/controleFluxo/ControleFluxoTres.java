package br.com.abc.introducao.controleFluxo;

public class ControleFluxoTres {
    public static void main(String[] args) {
        /*
        Switch
        switch() dentro desta estrutura vai a variável que podem ser char, int, byte, short, enum e String
         */
        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Terca feira");
                break;
            case 4:
                System.out.println("Quarta Feira");
                break;
            case 5:
                System.out.println("Quinta Feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        //char sexo = 'F';
        String sexo = "FF";
        switch (sexo){
            case "F":
                System.out.println("Femenino");
            break;
            case "M":
                System.out.println("Masculino");
            break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
