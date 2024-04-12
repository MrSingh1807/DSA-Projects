package javaLanguage;

import java.util.ArrayList;

public class SumOfArray {
    public static void main(String[] args) {

    }

    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int value1 = 0, value2 = 0;
        int size = Math.max(m, n);

        for (int i = 0; i < size; i++) {
            int multiple = multiply(n - i);
            if (i < n) value1 += a[i] * multiple;
            if (i < m) value2 += b[i] * multiple;
        }

        int sum = value1 + value2;
        ArrayList<Integer> result = new ArrayList<>();

        while (sum > 0) {
            int reminder = sum % 10;
            result.add(reminder);
            sum /= 10;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int multiply(int k) {
        int i = 1;
        for (int j = 1; j < k; j++) i *= 10;
        return i;
    }
}
