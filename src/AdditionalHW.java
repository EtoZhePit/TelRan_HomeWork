import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionalHW {
    //Напишите программу, которая определяет, может ли пользователь получить кредит на основе введенных данных.
    // Программа должна запрашивать у пользователя информацию о его доходе, возрасте и наличии задолженностей,
    // а затем использовать логические выражения для принятия решения.
    // Запросите у пользователя:
    // Наличие задолженностей (да/нет).
    // Месячный доход (в у.е.).
    // Возраст (в годах).

    // Условия для получения кредита:
    // Пользователь должен быть старше 21 года.
    // Месячный доход должен быть не менее 12000.
    // Нельзя иметь задолженности (если "да", то кредит не выдается).
    //
    // Используйте логические выражения для проверки условий.
    // Напишите логическое выражение, которое использует все эти данные и даёт результат true, если кредит выдаётся,
    // false, если нет.
    // В зависимости от того, какой результат получился, выведите на экран "Кредит одобрен" или "Кредит не одобрен".

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Наличие задолженностей (да/нет): ");
        String debt = reader.readLine();

        System.out.print("Месячный доход (в у.е.): ");
        String income = reader.readLine();

        System.out.print("Возраст (в годах): ");
        String age = reader.readLine();

        boolean hasDebt = debt.equals("да");
        boolean hasIncome = Integer.parseInt(income) >= 12000;
        boolean hasAge = Integer.parseInt(age) >= 21;

        boolean canGetCredit = !hasDebt && hasIncome && hasAge;

        System.out.println(canGetCredit ? "Кредит одобрен" : "Кредит не одобрен");
    }
}
