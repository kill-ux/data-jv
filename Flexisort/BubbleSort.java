
public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        int[] array = super.getArray();
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
