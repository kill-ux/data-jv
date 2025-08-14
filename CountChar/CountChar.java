public class CountChar {
    public static int count(String s, char c) {
        return s.length() - s.replace(c + "", "").length();
    }
}