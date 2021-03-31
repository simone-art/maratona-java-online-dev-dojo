package br.com.abc.introducao.array;

public class Array3 {
    public static void main(String[] args) {
        //3 formas para criar um array em Java
        int [] numeros = new int[5];
        int [] numeros2 = {1,2,3,4,5}; //Tamanho = 5 mas o index vai até 4 [0, 4]
        int [] numeros3 = new int[]{1,2,3,4,5};

//        for(int i = 0; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }

        //For each não tem iteração numérica(não tem i++)
        //É obrigatório definir a variável dentro do for
        for(int aux : numeros2){
            System.out.println(aux);
        }
    }
}
