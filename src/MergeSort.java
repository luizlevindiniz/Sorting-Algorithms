import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static int[] mergeSort(int @NotNull [] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int start = 0;
        int stop = arr.length-1;

        List<Integer> rawArr = Arrays.stream(arr).boxed().toList();
        List<Integer> result = divideAndConquer(rawArr, start, stop);
        return result.stream().mapToInt(i -> i).toArray();

    }

    public static @NotNull List<Integer> divideAndConquer(List<Integer> arr, int start, int stop) {

        if (start == stop) {
            List<Integer> result = new ArrayList<>();
            result.add(arr.get(start));
            return result;
        }

        int mid =  (start + stop) / 2;

        List<Integer> left = divideAndConquer(arr, start, mid);
        List<Integer> right = divideAndConquer(arr, mid+1, stop);

        return merge(left, right);
    }


    public static @NotNull List<Integer> merge(@NotNull List<Integer> left, @NotNull List<Integer> right) {
        int leftLength = left.size();
        int rightLength = right.size();

        List<Integer> result = new ArrayList<Integer>(rightLength + leftLength);

        int l = 0;
        int r = 0;

        boolean leftEmpty = false;
        boolean rightEmpty = false;

        while (!(leftEmpty && rightEmpty)) {
            if (leftEmpty) {
                for (int i = r; i < rightLength; i++) {
                    result.add(right.get(i));
                }
                rightEmpty = true;
            } else if (rightEmpty) {
                for (int i = l; i < leftLength; i++) {
                    result.add(left.get(i));
                }
                leftEmpty = true;
            } else if (l == leftLength) {
                leftEmpty = true;
            } else if (r == rightLength) {
                rightEmpty = true;
            } else if (left.get(l) < right.get(r)) {
                result.add(left.get(l));
                l++;
            } else if (left.get(l) > right.get(r)) {
                result.add(right.get(r));
                r++;
            } else {
                result.add(left.get(l));
                result.add(right.get(r));
                l++;
                r++;
            }

        }

        return result;

    }
}
