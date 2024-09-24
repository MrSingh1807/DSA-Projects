package kotlinLanguage

fun main() {

    val nums = intArrayOf(0, 10, 1, 7, 4, 8, 2, 1)
    val nums1 = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6)


    println("Ans -> " + findKthLargest(nums1, 4))

//    println()
//    printArray(nums)
}


fun findKthLargest(nums: IntArray, k: Int): Int {

    insertionSortReversed(nums)
    printArray(nums)
    println()

    var currentIndex = 0

    for (i in 0..nums.lastIndex) {
//        if (nums[i] != nums[i + 1]) currentIndex++

        if (i == k-1) return nums[i]
    }

    return 0
}

fun insertionSortReversed(nums: IntArray, k: Int = 1) {

//    //base case
    if (nums.isEmpty() || k >= nums.size) return

    for (i in k downTo 1) {
        if (nums[i - 1] < nums[i]) {
            swap(nums, i - 1, i)
        }
    }

    insertionSortReversed(nums, k + 1)
}
