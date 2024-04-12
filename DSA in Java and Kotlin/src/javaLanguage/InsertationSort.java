package javaLanguage;

public class InsertationSort {
    public static void main(String[] args) {

    }


    public static void insertionSort(int n, int[] arr) {

        int i = 0;
        while (i < n) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
                j--;
            }
            arr[i] = temp;
            i++;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) nums3[i + j] = nums1[i++];
            else nums3[i + j] = nums2[j++];
        }

        while (j < n) nums3[i + j] = nums2[j++];
        while (i < m) nums3[i + j] = nums1[i++];

    }
}