package kotlinLanguage

import java.util.Collections

fun main() {

    val nums = intArrayOf(64, 25, 12, 22, 11)
    selectionSort(0, nums)

    print("\n Nums ")
    nums.forEach { print("$it ") }
    println()
}

fun selectionSort(startIndex: Int, nums: IntArray) {
    var isSorted = true

    for (i in startIndex + 1..nums.lastIndex) {
        if (nums[startIndex] > nums[i]) {
            val temp = nums[i]
            nums[i] = nums[startIndex]
            nums[startIndex] = temp

            isSorted = false
        }
    }

    if (!isSorted) selectionSort(startIndex + 1, nums)

}