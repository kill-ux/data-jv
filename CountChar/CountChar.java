public class CountChar {
    public static int count(String s, char c) {
        int inc = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == c) {
                inc++;
            }
        }
        return inc;
    }
}