public class Digitlen {
    public static int digitlen(long number) {
        return number > 0 ? (number + "").length() : (-number + "").length();
    }
}