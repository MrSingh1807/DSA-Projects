package kotlinLanguage.puzzleQuestion

fun main() {

//    val array = arrayOf<Long>(1, 2, 3, 4, 5)
    println(timeConversion("12:45:54PM"))

}

fun calMid(start: Int, end: Int): Int {
    return start + (end - start) / 2
}

fun aVeryBigSum(ar: Array<Long>): Long {
    //todo: twoPointer approach

    var (start, end) = 0 to ar.lastIndex
    var sum: Long = 0

    while (start < end) {
        sum += ar[start] + ar[end]
        start++; end--
    }
    if (ar.size % 2 != 0) {
        sum += ar[start]
    }

    return sum
}


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    //todo:  Write your code here
    var (lrDiagonal, rlDiagonal) = 0 to 0
    var (start, end) = 0 to arr.lastIndex

    for (i in 0..arr.lastIndex) {
        lrDiagonal += arr[start][i]
        rlDiagonal += arr[i][end]
        start++; end--
    }

    return if (lrDiagonal > rlDiagonal) lrDiagonal - rlDiagonal else rlDiagonal - lrDiagonal
}


fun plusMinus(arr: Array<Int>): Unit {
    // todo: Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
//       Print the decimal value of each fraction on a new line with  places after the decimal.

    var (positive, negative, zero) = Triple(0, 0, 0)
    arr.forEach {
        if (it > 0) positive++ else if (it < 0) negative++ else zero++
    }

    println((positive * 100) / arr.size)
    println((negative * 100) / arr.size)
    println((zero * 100) / arr.size)
}

fun timeConversion(s: String): String {
    var hour = s.substring(0, 2)
    val minutAndSec = s.substring(2, 8)

    val roundClock = s.substring(8, 10)
    var hr = hour.toInt()

    if (roundClock == "PM" && hr != 12)  hr += 12
    else if (roundClock == "AM" && hr == 12) hr += 12

    hour = if (hr == 24) "00" else if (hr < 10) "0$hr" else hr.toString()
    return hour + minutAndSec
}

