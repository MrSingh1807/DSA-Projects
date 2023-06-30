package Arrays

import Arrays.ReverseArray.swap
import java.util.ArrayList


// Move Zeros
fun main() {
    var nums = intArrayOf(0, 1, 0, 3, 12)
    val num2 = intArrayOf(1, 0, 1)

    print(moveZeroes(nums).contentToString())

}


fun moveZeroes(nums: IntArray): IntArray {
    if (nums.size <= 1) {
        return nums
    }

    var i = 0

        for (j in nums.indices) {
            if (nums[j] != 0) {
                nums.swap(i++, j)
            }
        }

    return nums
}

fun IntArray.swap(start: Int, end: Int) {
    val value = get(start)
    set(start, get(end))
    set(end, value)
}