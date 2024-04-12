fun main() {
//    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//    [[1,1]]


    val arr = arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60))
//
//    val arr2 = arrayOf(intArrayOf(1, 3))
//    println(searchMatrix(arr2, 3))

    println(fib(8))

}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var str = 0
    var end = matrix.size * matrix[0].size - 1
    var mid = str + (end - str) / 2


    while (str <= end) {
        val midIndexPos = indexPos(mid, matrix.size)
        println("Mid Index - " + midIndexPos)
        if (midIndexPos.first > matrix.size - 1 || midIndexPos.second < 0) break
        val midValue = matrix[midIndexPos.first][midIndexPos.second]

        if (midValue > target) end = mid - 1
        else if (midValue < target) str = mid + 1
        else return true

        mid = str + (end - str) / 2
    }

    return false
}

fun index(row: Int, column: Int, rowLength: Int) =
    row * rowLength + column

fun indexPos(index: Int, rowLength: Int): Pair<Int, Int> {
    val row = index / rowLength;
    val column = index % rowLength;
    return row to column
}

fun fib(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
}

// A function that returns the n-th Fibonacci number
fun fibonacci(n: Int): Int {
    // Base cases: F(0) = 0, F(1) = 1
    if (n == 0) return 0
    if (n == 1) return 1
    // Recursive case: F(n) = F(n-1) + F(n-2)
    return fibonacci(n-1) + fibonacci(n-2)
}
