package telran.homework.controller;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    @Override
    public int compare (Integer a, Integer b) {
        boolean aEven = a % 2 ==0;
        boolean bEven = b % 2 ==0;

        if (aEven && !bEven) return -1;
        if (!aEven && bEven) return 1;

        if (aEven){
            return Integer.compare(a,b);
        } else {
            return Integer.compare(b,a);
        }
    }



}




/*

public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
 */