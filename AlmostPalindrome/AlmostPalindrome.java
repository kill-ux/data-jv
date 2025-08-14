public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (isPal(s)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPal(s.substring(0, i) + s.substring(i + 1))) {
                return true;
            }
        }

        return false;
    }

    public static boolean isPal(String s) {
        return s.equalsIgnoreCase(new StringBuffer(s).reverse().toString());
    }
}