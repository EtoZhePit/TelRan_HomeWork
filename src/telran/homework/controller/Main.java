package telran.homework.controller;

/*
Write code of the class OddEvenComparator implementing Comparator with the method
compare for sorting an array of Integers in the order:
The even integers should go before odd numbers  in the ascending order .
The odd integers should go after the even ones in the descending order.
Write Junit Test Case for class OddEvenComparator.

Integer[] origin = {1,2,3,4,5,6,7,8,9,3}
Integer[] expected = {2,4,6,8,9,7,5,3,3,1}


 */


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

       Integer[] arr = {1,2,3,4,5,6,7,8,9,3} ;

    bubbleSort(arr, new OddEvenComparator());

        System.out.println(Arrays.toString(arr));

    }

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


}
