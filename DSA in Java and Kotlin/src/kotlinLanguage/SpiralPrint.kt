fun main() {

    val matrix = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))

//    [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    matrix.forEachIndexed { index, ints ->
        matrix[index].forEach {
            print("$it ")
        }
        println()
    }

    println()
    spiralOrder(matrix).forEach {
        print("$it ")
    }
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()

    val (rows, cols) = matrix.size to matrix[0].size

    var (rowStart, rowEnd) = 0 to rows - 1
    var (colStart, colEnd) = 0 to cols - 1


    while (result.size < rows * cols) {
        for (c in colStart..colEnd) result.add(matrix[rowStart][c])
        rowStart++

        for (r in rowStart..rowEnd) result.add(matrix[r][colEnd])
        colEnd--

        for (c in colEnd downTo colStart) result.add(matrix[rowEnd][c])
        rowEnd--

        for (r in rowEnd downTo rowStart) result.add(matrix[r][colStart])
        colStart++
    }

    return result
}
