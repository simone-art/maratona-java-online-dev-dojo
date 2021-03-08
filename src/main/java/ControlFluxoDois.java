public class ControlFluxoDois {
    public static void main(String[] args) {
        int idade = 25;
        String status;
        if(idade >= 18){
            status = "Você é adulto";
        }else{
            status = "Você não é adulto";
        }
        System.out.println(status);
    }
}
