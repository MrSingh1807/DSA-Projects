package javaLanguage;

public class BookAllocationProb {
    public static void main(String[] args) {

    }

    public static void selectionSort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minimumIndex]) minimumIndex = j;

            swap(arr, minimumIndex, i);
        }
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
