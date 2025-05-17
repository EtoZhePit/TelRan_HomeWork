import java.util.Arrays;

public class ArraySortAppl {
    public static void main(String[] args) {
        int [] arr = new int[10];
        fillArray(arr, 10,100);
        printArray(arr);
 //       bubbleSort1(arr);
 //       printArray(arr);
        int index = binarySearch(arr,  58);
        System.out.println("Index = " + index);
 //     selectSort(arr); //HomeTask 1
 //       InsertionSort(arr); // HomeTask 2
 //       mergeSort(arr); // HomeTask 3
        quickSort(arr, 0,arr.length -1); //HomeTask 4

        printArray(arr);

    }

   public static void quickSort(int[] arr, int lowestNum, int highestNumber){
        if(lowestNum < highestNumber) {
            int middleIndex = quickSortMethod(arr,lowestNum,highestNumber);
                    quickSort (arr, lowestNum, middleIndex - 1);
                    quickSort(arr, middleIndex + 1,highestNumber);
        }

   }

    private static int quickSortMethod(int[] arr, int lowestNum, int highestNumber) {
        int middleNumber = arr[highestNumber];
        int i = lowestNum - 1;

        for (int j = lowestNum; j < highestNumber; j++) {
            if (arr[j] <= middleNumber){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[highestNumber];
        arr[highestNumber] = temp;

        return i+1;
    }

    public static int binarySearch(int[] arr, int value){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
        int mid = (l+r) / 2;
        if (arr[mid] == value){
            return mid;
        }
        if (arr[mid] > value){
            r = mid - 1;
        } else {
            l = mid + 1;
        }
        }
        return -l - 1;
    }

    public static void selectSort (int [] arr){     //HomeTask1       // *** Сделать максимальное кол-во методов сортировок. Например, ставка, merge, quick и hip
        for (int i = 0; i <arr.length-1 ; i++) {
            int minInd = i;

            for (int j = i + 1; j <arr.length ; j++) {
             if (arr[j] < arr[minInd]){
                 minInd = j;
             }
            }
           int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }

    public static void InsertionSort (int [] arr){
        for (int i = 1; i <arr.length ; i++) {
         int key = arr[i];
         int j = i-1;

         while (j >= 0 && arr[j] > key){
             arr[j+1] = arr[j];
             j--;
         }
          arr [j+1] = key;
        }
    }

    public static void mergeSort (int [] arr) {
        if (arr.length < 2) return;

        int mid = (arr.length/2);
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        mergeSortTask(arr,left,right);

    }

    private static void mergeSortTask(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0, res = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]){
               arr[res] = left[l];
               res++; l++;
            } else {
                arr[res] = right[r];
                res++; r++;
            }
        }
    while (l < left.length) {
        arr[res] = left[l];
        res++; l++;
    }
    while (r < right.length) arr[res++] = right[r++];
    }

    private static void bubbleSort1(int[] arr) {
        while (bubbling(arr)); // пока true - то возвращаем
    }

    private static boolean bubbling(int[] arr) {
        boolean res = false;
      for (int j=0; j<arr.length -1; j++){ // убираем "-i" числа которые уже проверенные
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    res = true;
                }
            }
      return res;
        }


    public static void bubbleSort(int [] arr) {
        for (int i = 0; i <arr.length - 1 ; i++) {
            for (int j=0; j<arr.length -1 - i ; j++){ // убираем "-i" числа которые уже проверенные
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }

    }

    private static void fillArray(int[] arr, int from, int to) { // набить массив рандомом
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (from + Math.random()*(to - from + 1));

        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
