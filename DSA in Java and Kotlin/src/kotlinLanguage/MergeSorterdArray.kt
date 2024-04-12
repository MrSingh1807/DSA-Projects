fun main() {

    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3

    val nums3 = intArrayOf(0, 1, 0, 3, 12)

    moveZeroes(nums3)
}

fun moveZeroes(nums: IntArray): Unit {
    var i = 0
    for (j in nums.indices) if (nums[j] != 0) {
        val temp = nums[i]
        nums[i++] = nums[j]
        nums[j] = temp
    }

    printArray(nums)

}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val finalArray = IntArray(m + n)
    var (i, j) = 0 to 0
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) finalArray[i + j] = nums1[i++]
        else finalArray[i + j] = nums2[j++]
    }

    while (j < n) finalArray[i + j] = nums2[j++]
    while (i < m) finalArray[i + j] = nums1[i++]

    printArray(finalArray)
}

fun printArray(arr: IntArray) {
    arr.forEach {
        println("$it ")
    }
}
