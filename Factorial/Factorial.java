public class Factorial {
    public static Integer factorial(Integer n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}