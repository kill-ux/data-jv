public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        // if (arr.length == 0)
        // return arr;
        // if (rotationCount > 0) {
        // while (rotationCount > 0) {
        // int temp = arr[arr.length - 1];
        // for (int i = 0; i < arr.length; i++) {
        // int reset = arr[i];
        // arr[i] = temp;
        // temp = reset;
        // }
        // rotationCount--;
        // }
        // } else {
        // while (rotationCount < 0) {
        // int temp = arr[0];
        // for (int i = arr.length - 1; i > 0; i--) {
        // System.out.println(arr[i]);
        // int reset = arr[i];
        // arr[i] = temp;
        // temp = reset;
        // }
        // arr[0] = temp;
        // rotationCount++;
        // }
        // }
        // return arr;

        Integer[] new_arr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[Math.floorMod(rotationCount + i, arr.length)] = arr[i];
        }
        return new_arr;

    }
}