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
        System.out.println("rodando em 90 graus");
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
            System.out.println(ret[i][0] + "" + ret[i][1] + "" + ret[i][2]);
        }
        a1=ret;
    }

    public static void main(String[] args){
        rodaroda(a1);
        roda180(a1);
        roda270(a1);
    }
    public static void roda180(int[][] roda180){
        int largura = roda180.length;
        int altura = roda180[0].length;
        int[][] rodinha = new int[altura][largura];
        System.out.println("-------------------");
        System.out.println("rodando em 180 graus");
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                rodinha[i][j] = roda180[largura - j - 1][i];
            }
            System.out.println(rodinha[i][0] + "" + rodinha[i][1] + "" + rodinha[i][2]);
        }
        a1=rodinha;
    }
    public static void roda270(int[][] roda270){
        int largura = roda270.length;
        int altura = roda270[0].length;
        int[][] rodamsm = new int[altura][largura];
        System.out.println("-------------------");
        System.out.println("rodando em 270 graus");
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                rodamsm[i][j] = roda270[largura - j - 1][i];
            }
            System.out.println(rodamsm[i][0] + "" + rodamsm[i][1] + "" + rodamsm[i][2]);
        }
    }
}
