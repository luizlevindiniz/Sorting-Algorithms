public class QuickSort {
    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int len = arr.length;
        int pivot = arr[len - 1];

        int leftPointer = 0;
        int rightPointer = len - 1;

        // partition
        while (leftPointer < rightPointer) {
            if (arr[leftPointer] <= pivot) {
                leftPointer++;
            } else if (arr[rightPointer] >= pivot) {
                rightPointer--;
            } else {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
            }
        }

        // swapping leftPointer/rightPointer element with pivot
        int toSwap = arr[leftPointer];
        arr[leftPointer] = pivot;
        arr[len - 1] = toSwap;

        int[] leftHalf = new int[leftPointer];
        int[] rightHalf = new int[len - 1 - rightPointer];

        // left half (all elements less than pivot)
        System.arraycopy(arr, 0, leftHalf, 0, leftPointer);
        // right half (all elements greater than pivot)
        System.arraycopy(arr, rightPointer + 1, rightHalf, 0, len - 1 - rightPointer);

        // recursion call
        int[] less = quickSort(leftHalf);
        int[] greater = quickSort(rightHalf);

        // concatenation
        int[] result = new int[len];

        // copying all elements that are less than or equal to
        System.arraycopy(less, 0, result, 0, less.length);
        // appending the pivot
        result[less.length] = pivot;
        // copying all elements that are greater than
        System.arraycopy(greater, 0, result, less.length + 1, greater.length);

        return result;
    }


}
