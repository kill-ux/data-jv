public class MultiplicationTable {
    public static void generate(int num) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(String.format("%d x %d = %d",num , i , num * i));
        }
    }
}