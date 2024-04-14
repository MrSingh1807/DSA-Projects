package kotlinLanguage


fun main() {
    val dummyList = intArrayOf(10, 4, 5, 2, 9, 4, 7, 2, 1)
    bubbleSort(dummyList)

    print("Ans ")
    dummyList.forEach { print("$it ") }
}

fun bubbleSort(result: IntArray) {
    var isSwapped = false

    for (j in 0..<result.lastIndex) {
        if (result[j] > result[j + 1]) {
            val temp = result[j + 1]
            result[j + 1] = result[j]
            result[j] = temp
            isSwapped = true
        }
    }


    //todo: base case
    if (!isSwapped) return
    else bubbleSort(result)
}