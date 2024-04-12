package javaLanguage;

import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {


    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int firstOccur = firstOccur(arr, n, k);
        int lastOccur = lastOccur(arr, n, k);
        return new int[]{firstOccur, lastOccur};
    }

    static int firstOccur(ArrayList<Integer> arr, int n, int k) {
        int start = 0, end = arr.size() - 1;
        int mid = start + (end - start) / 2;

        int ans = -1;
        while (start <= end) {
            if (arr.get(mid) == k) {
                ans = mid;
                end = mid - 1;
            } else if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    static int lastOccur(ArrayList<Integer> arr, int n, int k) {
        int start = 0, end = arr.size() - 1;
        int mid = start + (end - start) / 2;

        int ans = -1;
        while (start <= end) {
            if (arr.get(mid) == k) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
