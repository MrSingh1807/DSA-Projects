fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val nums2 = intArrayOf(2, 1, 3, 4)

//    rotate(nums, 3)

    println(check(nums))

}

fun rotate(nums: IntArray, k: Int) {
    for (i in 1..k) {
        val temp = nums.last()
        for (j in nums.lastIndex downTo 1) {
            nums[j] = nums[j - 1]
        }
        nums[0] = temp
    }

    printArray(nums)
}

fun check(nums: IntArray): Boolean {
    var count = 0
    for (i in 0..<nums.lastIndex)
        if (nums[i] > nums[i + 1]) count++

    if (nums.last() > nums.first()) count++

    return count <= 1
}
