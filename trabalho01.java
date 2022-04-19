public class trabalho01 {
    static int[][] a1 = new int[][]{
        new int[]{1,2,3},
        new int[]{4,5,6},
        new int[]{7,8,9}
    };

    public static void rodaroda(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
            System.out.println(ret[i][0] + "" + ret[i][1] + "" + ret[i][2]);
        }
    }

    public static void main(String[] args){
       rodaroda(a1);
    }
}
