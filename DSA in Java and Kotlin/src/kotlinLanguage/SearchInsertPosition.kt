package kotlinLanguage

fun main() {

    val nums = intArrayOf(1, 3, 5, 6)
    val target = 6

    println(searchInsert(nums, target))

}

fun searchInsert(nums: IntArray, target: Int): Int {

    var start = 0
    var end = nums.lastIndex


    while (start <= end) {
        val mid = start + (end - start) / 2

        if (nums[mid] < target) start = mid + 1
        else if (nums[mid] > target) end = mid - 1
        else return mid
    }

    return start
}
