public class HomeWorkCalculator {
    // task with + - * / % ^
    public static void main(String[] args) {
        double resFinal = calc(10, 5, '*');
        System.out.println("Result = " + resFinal);

    }

    public static double calc(double a, double b, char op) {
        double res = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow(a, b);

            default -> {
                System.out.println("Wrong operation");
                yield 0./0.;
            }
        };
   return res; }

}
