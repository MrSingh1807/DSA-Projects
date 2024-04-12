package javaLanguage;

public class BubbleSort {
    public static void main(String[] args) {

    }


    public static void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i; j++)
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);


    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
