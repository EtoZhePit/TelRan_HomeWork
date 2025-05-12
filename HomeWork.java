public class HomeWork {
    public static void main (String[] args){
        int res = countDigits(123);
        System.out.println("count digits = " + res); //3
        res = countDigits(8); //1
        System.out.println(res);
        res = countDigits(0); //1
        System.out.println(res);

        luckyNumber(173854); // 1+3+6 != 7+8+4 - unlucky - через один. Нужно сравнить суммы 1-3-5 числа с 2-4-6
        luckyNumber(123321);
    }

    private static void luckyNumber(int i) {
        // todo sout - lucky/unlucky

        int sum135 = 0;
        int sum246 = 0;

        for (int p = 0; p <= i; p++) {
            int digit1 = i % 10;
            i = i / 10;

            if (p == 1 || p == 3 || p == 5) {
                sum246 = sum246 + digit1;
            } else if (p == 2 || p == 4 || p == 6) {
                sum135 = sum135 + digit1;
            }

        }
        if (sum135 == sum246) {
            System.out.println("lucky");
        } else {
            System.out.println("unlucky");
        }
    }

    private static int countDigits(int num) {
        int sum = 0;
        int digit = 0;
        for ( digit = num % 10; num != 0; num = num / 10) {
            sum++;
        }
        if (digit == 0) {
            sum++;
        }

        return sum;
    }
}
