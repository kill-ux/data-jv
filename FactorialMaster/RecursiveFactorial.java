public class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n < 2) {
            return 1;
        }
        return n * calculate(n-1);
    }
}