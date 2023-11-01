public class HomeWorkMatrix {
    public static void main(String[] args) {
        int[][] neoMatrix = new int[8][8];

        for (int i = 0; i < neoMatrix.length; i++) {
             for (int j = 0; j < neoMatrix.length; j++) {
                    if (i % 2 == 0) {
                    neoMatrix[i][j] = j + 1;
                    System.out.print(neoMatrix[i][j] + "\t");
                    } else {
                        neoMatrix[i][j] = 8-j;
                        System.out.print(neoMatrix[i][j] + "\t");
                    }
             }
             System.out.println();
        }
    }
}
