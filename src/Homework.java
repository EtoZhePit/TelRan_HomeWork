public class Homework {

    static boolean isFunction5Called = false;
    static boolean isFunction6Called = false;
    static boolean isMainCalled = false;

    public static void main(String[] args) {
        System.out.println("I'm a main");
        Function6();
        Function1();
        Function2();
    }

    public static void Function1() {
        System.out.println("Function1");
        Function4();
    }

    public static void Function2() {
        System.out.println("Function2");
        if (!isFunction6Called) {
            isFunction6Called = true;
            Function6();
        }
        if (!isMainCalled) {
            isMainCalled = true;
            main(null);
        }
    }

    public static void Function3() {
        System.out.println("Function3");
    }

    public static void Function4() {
        System.out.println("Function4");
        Function5();
    }

    public static void Function5() {
        System.out.println("Function5");
        if (!isFunction6Called) {
            isFunction6Called = true;
            Function6();
        }
    }

    public static void Function6() {
        System.out.println("Function6");
        if (!isFunction5Called) {
            isFunction5Called = true;
            Function5();
        }
        if (!isFunction6Called) {
            isFunction6Called = true;
            Function2();
        }
    }
}
