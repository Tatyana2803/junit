public class Calculator {

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static String minimum(int a, int b) {
        String min;
        if ((a - b) < 0) {
            min = "Меньше первое число";
        } else if ((a - b) > 0) {
            min = "Меньше второе число";
        } else min = "Числа равны";
        return min;
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

}
