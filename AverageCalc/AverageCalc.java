public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step == 0)
            return 0;
        int inc = 0;
        int res = 0;
        int i = start;
        if (start < end) {
            while (i < end) {
                res += i;
                inc++;
                i += step;
            }
        } else {
            while (i > end) {
                res += i;
                inc++;
                i += step;
            }
        }
        return inc == 0 ? start : res / inc;
    }
}