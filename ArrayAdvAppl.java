public class ArrayAdvAppl {
    public static void main (String[] args){
        int [] arr = new int[10];
        printArray(arr);
        fillArray(arr, 10,99);
        printArray(arr);
        int res = sumArray(arr);
        System.out.println("SumArray = " + res);
        double avg = average(arr);
        System.out.println("Avg = " + avg);
        res = max(arr);
        System.out.println("Max = " + res);
        res = search(arr, arr[7]);
        System.out.println("Index = " + res);
    }

    private static int search(int[] arr, int i) { // поиск значения
        int requestedNumber = 0;
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j] == i){
                requestedNumber = arr[j];
            }
        }
        return requestedNumber;
    }

    private static int max(int[] arr) {
        int remainingNumber = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > remainingNumber){
                remainingNumber = arr[i];
            }
        }
        return remainingNumber;
    }

    private static double average(int[] res) { // посчитать среднее ар
        int sumOfArray = 0;
        int numberOfArray = 0;
        for (int i = 0; i <res.length ; i++) {
            sumOfArray = sumOfArray += res[i];
            numberOfArray++;
        }
            return sumOfArray/numberOfArray;
    }

    private static int sumArray(int[] arr) { // сумма
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
           sum = sum += arr[i];
        }
        return sum;
    }

    private static void fillArray(int[] arr, int from, int to) { // набить массив рандомом
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (from + Math.random()*(to - from + 1));

        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("arr[i] = " + arr[i] + "\t");
        }
        System.out.println();
    }
}

