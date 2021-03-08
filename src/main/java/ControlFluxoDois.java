public class ControlFluxoDois {
    public static void main(String[] args) {
        int idade = 25;
        String status;
//        if(idade >= 18){
//            status = "Você é adulto";
//        }else{
//            //Uso de operador ternário e úma forma de inicializar uma variável
//            //utilizando uma instrução de uma linha só
//            status = "Você não é adulto";
//        }
        status = idade > 18? "Você é adulto" : "adulto";
        System.out.println(status);
    }
}
