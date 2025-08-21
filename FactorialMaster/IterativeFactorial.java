public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        int res = 1;
        for (int i = 2; i <= n ; i++) {
            res *= i;
        }
        return res;
    }
}