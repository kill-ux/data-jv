public class ArmstrongNumber {
    public boolean isArmstrong(int number) {
        // Implementation to check if the given number is an Armstrong number
        if (number < 0) return false;
        int sum = 0; 
        String str = number + "";
        for (int i = 0; i < str.length() ; i++) {
            sum += Math.pow(Integer.parseInt(str.charAt(i) + "") , str.length()) ;
        }

        return sum == number;
    }
}