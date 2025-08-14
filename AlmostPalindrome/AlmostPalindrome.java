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
        System.out.println(s);
        if (s.length() % 2 == 0) {
            return s.substring(0, s.length() / 2)
                    .equals(new StringBuilder(s.substring(s.length() / 2)).reverse().toString());
        } else {
            return s.substring(0, s.length() / 2)
                    .equals(new StringBuilder(s.substring((s.length() + 1) / 2)).reverse().toString());
        }
    }
}