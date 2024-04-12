package javaLanguage;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {3, 4}};

//        System.out.println(0 % 2);
        printArray(wavePrint(arr, 2, 2));
    }

    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        int[] result = new int[nRows * mCols];
        int index = 0;

        for (int col = 0; col < mCols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < nRows; row++)
                    result[index++] = arr[row][col];
            } else {
                for (int row = nRows - 1; row >= 0; row--)
                    result[index++] = arr[row][col];
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
