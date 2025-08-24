public class PerfectNumber {
    public boolean isPerfectNumber(int number) {
        // Implementation to check if the given number is a perfect number
        if (number <= 0) return false;
        int sum = 0; 
        for (int i = number-1; i > 0 ; i--) {
            if (number % i == 0) {
                sum+= i;
            }
        }
        return sum == number;
    }
}