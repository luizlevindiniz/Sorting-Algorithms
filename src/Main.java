import java.util.Arrays;

public class Main {
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        int[] nearlySorted = new int[]{0, 1, 2, 4, 3, 5, 6, 7, 8, 9, 10};
        int[] random = new int[]{13, 4124, 55, 1, 45, 677, 3, 5, 3463, 1, -4, 6, 7843, 0};
        int[] reversed = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(RED + "Bubble Sort O(n2)" + RESET);
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(random.clone())));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(reversed.clone())));

        System.out.println(RED + "Insertion Sort O(n2)" + RESET);
        System.out.println(Arrays.toString(InsertionSort.insertionSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(random.clone())));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(reversed.clone())));

        System.out.println(RED + "Selection Sort O(n2)" + RESET);
        System.out.println(Arrays.toString(SelectionSort.selectionSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(random.clone())));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(reversed.clone())));

        System.out.println(RED + "Merge Sort O(n log n)" + RESET);
        System.out.println(Arrays.toString(MergeSort.mergeSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(MergeSort.mergeSort(random.clone())));
        System.out.println(Arrays.toString(MergeSort.mergeSort(reversed.clone())));

        System.out.println(RED + "Quick Sort O(n log n)" + RESET);
        System.out.println(Arrays.toString(QuickSort.quickSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(QuickSort.quickSort(random.clone())));
        System.out.println(Arrays.toString(QuickSort.quickSort(reversed.clone())));

        System.out.println(RED + "Selection Sort O(n + r)" + RESET);
        System.out.println(Arrays.toString(CountingSort.countingSort(nearlySorted.clone())));
        System.out.println(Arrays.toString(CountingSort.countingSort(random.clone())));
        System.out.println(Arrays.toString(CountingSort.countingSort(reversed.clone())));

    }
}