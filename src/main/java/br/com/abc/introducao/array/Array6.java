package br.com.abc.introducao.array;

public class Array6 {
    public static void main(String[] args) {
//        int [] arraInt = {1,2,3};
//        int [] arraInt2 = new int[3];
//        int [] arraInt3 = new int[]{1,2,3};


        int[][] dias = new int[3][];
        //dias[0] = array   new int[2] = posicões do Array
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];

        for(int[] arr: dias){
            for(int num: arr){
                System.out.println(num);
            }
        }

    }
}
