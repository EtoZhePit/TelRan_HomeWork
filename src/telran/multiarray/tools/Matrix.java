package telran.multiarray.tools;

public class Matrix {
    public static int sum (int [][] matrix){
        //TODO

        int res = 0;

        for (int i = 0; i <matrix.length  ; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                int temp = matrix[i][j];
                res = res + temp;

            }
        }
        return res;
    }

    public static int[][] transp(int[][] matrix1) {
        //ToDO


        int y = matrix1.length;
        int x = matrix1[0].length;

        int [][] freshArray = new int[x][y];


        for (int i = 0; i < y ; i++) {
            for (int j = 0; j < x ; j++) {
                freshArray[j][i] = matrix1[i][j];
            }
        }

        return freshArray;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        //ToDo
        // m1 = a*b
        // m2 = b * c
        // m3 = a*c

        int a = matrix1.length;
        int b = matrix1[0].length;
        int c = matrix2[0].length;

        if (b != matrix2.length) {
            System.out.println("error");
            return null;
        }

        int [][] freshArr = new int[a][c];

        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < c ; j++) {
                for (int k = 0; k <b; k++) {
                    freshArr [i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }

        }
        return freshArr;
    }
}

