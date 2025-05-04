import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask {
    // Напишите программу, которая запрашивает у пользователя число.
// Если введённое число делится нацело на три, вывести на экран – «Ваше число делится на три».
// Если нет – вывести на экран – «Ваше число не делится на три».


    public static void main(String[] args) throws exception, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");
        String input = reader.readLine();
        int number = Integer.parseInt(input);

        if (number % 3 == 0) {
            System.out.println("Ваше число делится на три");
        } else {
            System.out.println("Ваше число не делится на три");
        }

        HW2();
    }

// Напишите программу, которая запрашивает у пользователя три числа.
// Выведите на экран фразу "Сумма трёх чисел положительная и чётная", если это так.
// Для всех остальных случаев нужно просто выводить сумму трёх чисел на экран.

        public static void HW2 () throws exception, IOException {
            BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Введите число 1: ");
            String input1 = newReader.readLine();
            int number1 = Integer.parseInt(input1);

            System.out.print("Введите число 2: ");
            String input2 = newReader.readLine();
            int number2 = Integer.parseInt(input2);

            System.out.print("Введите число 3: ");
            String input3 = newReader.readLine();
            int number3 = Integer.parseInt(input3);

            if (number1 % 2 == 0 && (number2 % 2 == 0) && (number3 % 2 == 0) && (number1 > 0) && (number2 > 0) && (number3 > 0)) {
                System.out.println("Сумма трёх чисел положительная и чётная");
            } else {
                System.out.println(number1 + number2 + number3);
            }

        }

    }

