public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    index = j;
                }
            }
            arr[index] = temp;
        }

        return arr;
    }
}
