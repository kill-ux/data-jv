public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if (AlmostPalindrome(s)) {
            return false;
        }
        if (s.length() < 3)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (AlmostPalindrome(s.substring(0, i) + s.substring(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean AlmostPalindrome(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}