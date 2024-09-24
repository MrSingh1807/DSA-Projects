package kotlinLanguage

fun main() {
    val nums = intArrayOf(0,10, 1, 7, 4, 8, 2, 11)
    insertionSort(1, nums)

    print("\n \n Result Arr ")
    nums.forEach { print("$it ") }
}

fun insertionSort(k: Int, nums: IntArray) {
    var isSorted = true

    for (i in k downTo  1) {
        if (nums[i - 1] > nums[i]) {
            swap(nums, i - 1, i)
            isSorted = false
        }
    }
    print("\n Testing Arr ")
    nums.forEach { print("$it ") }

    if (!isSorted) insertionSort(k + 1, nums)
}

fun swap(nums: IntArray, startIndex: Int, endIndex: Int) {
    val temp = nums[startIndex]
    nums[startIndex] = nums[endIndex]
    nums[endIndex] = temp
}
//inline fun <reified T> swap(nums: Array<T>, startIndex: Int, endIndex: Int) {
//    val temp = nums[startIndex]
//    nums[startIndex] = nums[endIndex]
//    nums[endIndex] = temp
//}