package telran.multiarray.controller;

public class InterviewTestAppl {
    public static void main(String[] args) {
         // заполнить массив таблицей умножения

        int[][] arr = new int[10_000][10_000];
        long t1 = System.currentTimeMillis();
        fillArrayOpt(arr); // дз - рассуждать почему так произошло (почему время в оптимизированном варианте больше)
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);






    }

    public static void fillArray(int [][] arr) {
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = i*j;
                
            }
            
        }
    }

    private static void fillArrayOpt(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
        arr[i][i] = i*i; // диагональ
            for (int j = i+1; j <arr[i].length; j++) {
                arr[i][j] = arr[j][i] = i*j; // мы заполнили строку и столбец
            }
        }
    }
}
