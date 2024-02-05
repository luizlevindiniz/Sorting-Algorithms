import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class CountingSort {
    public static int[] countingSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
        int max = stats.getMax();
        int min = stats.getMin();

        // creating an array with range + 1 zeros to count
        int range = max - min;
        int[] countingArr = new int[range + 1];

        // populating counting array
        for (int num : arr) {
            int index = num - min;
            countingArr[index]++;
        }

        // precomputing counting array using prefix sum
        for (int i = 1; i < countingArr.length; i++) {
            countingArr[i] += countingArr[i - 1];
        }

        // creating the output array
        int[] output = new int[arr.length];

        // populating output array
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = arr[i] - min;
            int countingArrValue = countingArr[index];

            // value - min = new index in output to store arr[i]
            output[countingArrValue - 1] = arr[i];
            // decreasing prefix sum value for index
            countingArr[index]--;
        }

        return output;
    }
}
