public class trabalho01{

    public static void main(String[] args){}
    int[][] a1 = new int[][]{
    new int[]{1,2,3},
    new int[]{4,5,6},
    new int[]{7,8,9}};
            public static int[][] rotacionarMatrizHorario(int[][] matriz) {
                int largura = matriz.length;
                int altura = matriz[0].length;
                int[][] ret = new int[altura][largura];
                for (int i=0; i<altura; i++) {
                    for (int j=0; j<largura; j++) {
                        ret[i][j] = matriz[largura - j - 1][i];
                    }
                 }
                return ret;
            }
        }