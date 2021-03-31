public class Array5 {
    public static void main(String[] args) {

        //Arrays multidimensionais se criam com um corchete a mais
        //dias[0][0] = 30; o primer zero é do array, o outro é da posição
        //int[0][1] dias = new int[0][0][0][1] [1][0][1][1]
        int [][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 29;
        dias[1][0] = 28;
        dias[1][1] = 27;

        for(int i = 0; i< dias.length; i++){
            //System.out.println(dias[i]);
            for(int j = 0; j <dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("===========================");
        for(int[] ref : dias){
            for(int dia : ref){
                System.out.println(dia);
            }
        }
        
    }
}
