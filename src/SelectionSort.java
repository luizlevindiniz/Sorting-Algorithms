public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int lowest = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < lowest) {
                    lowest = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = lowest;
        }

        return arr;
    }

}
