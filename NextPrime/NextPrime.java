public class NextPrime {
    public static Integer nextPrime(Integer n) {
        if (n < 2) {
            return 2;
        }
        while (true) {
            n++;
            if (isPrime(n)) {
                return n;
            }
        }
    }

    public static boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}