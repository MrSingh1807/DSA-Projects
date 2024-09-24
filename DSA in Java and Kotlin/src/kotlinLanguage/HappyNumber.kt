package kotlinLanguage

/*
*
Input: n = 19
Output: true

*
* */

fun main() {


    println(isHappy(19))

//    println(2430 % 1000)
}


fun isHappy(n: Int): Boolean {
    if (n < 0) return false

    var result = 0
    var currentN = n

    while (result != 1) {
        println("Result -> $result")
        val length = currentN.toString().length
        result = 0

        for (i in 1..length) {
            val tenPow = 10 power length - i
            val digit = currentN / tenPow

            result += digit power 2
            currentN %= tenPow
        }
        currentN = result
    }

    return true
}

/*
fun isHappy(n: Int): Boolean {

    var result = 0
    var currentN = n
    val length = n.toString().length

    for (i in 1..length) {
        val tenPow = 10 power length - i
        val digit = currentN / tenPow

        result += digit power 2

        currentN %= tenPow
    }

    println(result)
    return if (result >= 10) isHappy(result) else result == 1
}
*/

infix fun Int.power(num: Int) = run {
    var result = 1
    for (i in 1..num) result *= this
    result
}

//fun Int.square() = this * this
