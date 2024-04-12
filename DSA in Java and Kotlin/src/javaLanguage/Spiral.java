package javaLanguage;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        //    [[1,2,3,4],[5,6,7,8],[9,10,11,12]]

        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

        System.out.println();

        List<Integer> result = spiralOrder(arr);
        for (int i = 0; i < result.size(); i++)
            System.out.print(result.get(i) + " ");

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length, cols = matrix[0].length;

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;


        while (result.size() < rows * cols) {
            for (int c = colStart; result.size() < rows * cols && c <= colEnd; c++) result.add(matrix[rowStart][c]);
            rowStart++;

            for (int r = rowStart; result.size() < rows * cols && r <= rowEnd; r++) result.add(matrix[r][colEnd]);
            colEnd--;

            for (int c = colEnd; result.size() < rows * cols && c >= colStart; c--) result.add(matrix[rowEnd][c]);
            rowEnd--;

            for (int r = rowEnd; result.size() < rows * cols && r >= rowStart; r--) result.add(matrix[r][colStart]);
            colStart++;
        }

        return result;
    }

}
