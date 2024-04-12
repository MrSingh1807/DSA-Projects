package javaLanguage;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        print2DArray(arr);
        System.out.println();

        rotate(arr);

//        [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

    }

    public static void rotate(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        int resultSize = 0;

        int rows = matrix.length, cols = matrix[0].length;

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        int rowStr = 0, rEnd = rows - 1;
        int colStr = 0, cEnd = cols - 1;

        while (resultSize < rows * cols - 1) {

            for (int r = rowEnd, c = colStr; resultSize < rows * cols && r >= rowStart && c <= cEnd; r--, c++) {
                result[rowStr][c] = matrix[r][colStart];
                resultSize++;
            }
            colStart++;
            rowStr++;

            for (int c = colStart, r = rowStr; resultSize < rows * cols && r <= rEnd && c <= colEnd; c++, r++) {
                result[r][cEnd] = matrix[rowStart][c];
                resultSize++;
            }
            rowStart++;
            cEnd--;

            for (int r = rowStart, c = cEnd; c >= colStr && resultSize < rows * cols && r <= rowEnd; r++, c--) {
                result[rEnd][c] = matrix[r][colEnd];
                resultSize++;
            }
            colEnd--;
            rEnd--;

            for (int c = colEnd, r = rEnd; r >= rowStr && resultSize < rows * cols && c >= colStart; c--, r--) {
                result[r][colStr] = matrix[rowEnd][c];
                resultSize++;
            }
            rowEnd--;
            colStr++;
        }

        matrix = result;
        print2DArray(matrix);

        System.out.println();

        print2DArray(result);
    }

    static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
