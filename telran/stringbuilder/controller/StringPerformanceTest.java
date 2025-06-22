package telran.stringbuilder.controller;

public class StringPerformanceTest {

    private static final String WORD = "meow"; // final - константа внутри класса которую нельзя менять
    private static final int MAX_ITERATION = 100_000;

    public static void main(String[] args) {
        // String
        String str = "";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <MAX_ITERATION ; i++) {
            str += WORD;
        }
        long t2 = System.currentTimeMillis(); // метод который достает время в милисекундах на компе
        System.out.println(t2 - t1);
        // StringBuilder;
        StringBuilder builder = new StringBuilder("");
        t1 = System.currentTimeMillis();
        for (int i = 0; i <MAX_ITERATION ; i++) {
            builder.append(WORD);
        }
        t2 = System.currentTimeMillis(); // метод который достает время в милисекундах на компе
        System.out.println(t2 - t1);
    }
}
