package kotlinLanguage

fun main() {

    val demoArray = intArrayOf(38, 27, 43, 3, 9, 82, 10)

    mergeSort(demoArray, 0, demoArray.lastIndex)

    print("\n \n Demo Array ")
    demoArray.forEach { print("$it ") }

    println()
}

fun mergeSort(nums: IntArray, s: Int, e: Int) {
    //todo:  base case
    if (s >= e) return

    val mid = s + (e - s) / 2

    // left part
    mergeSort(nums, s, mid)
    //right part
    mergeSort(nums, mid + 1, e)

    merge(nums, s, e)
}

fun merge(nums: IntArray, s: Int, e: Int) {
    val mid = s + (e - s) / 2

    //todo: break array into two part
    val arr1 = ArrayList<Int>(mid - s + 1)
    val arr2 = ArrayList<Int>(e - mid)

    //todo: create two new array separated form original from mid
    var originalArrayIndex = s
    for (i in 0..<mid - s + 1) arr1.add(nums[originalArrayIndex++])
    for (i in 0..<e - mid) arr2.add(nums[originalArrayIndex++])

    //todo: merge both array
    var index1 = 0
    var index2 = 0

    originalArrayIndex = s

    while (index1 < arr1.size && index2 < arr2.size) {
        if (arr1[index1] < arr2[index2]) {
            nums[originalArrayIndex++] = arr1[index1++]
        } else nums[originalArrayIndex++] = arr2[index2++]
    }

    while (index1 < arr1.size) nums[originalArrayIndex++] = arr1[index1++]
    while (index2 < arr2.size) nums[originalArrayIndex++] = arr2[index2++]
}

fun printArray(arr: ArrayList<Int>) {
    print("Array ")
    arr.forEach { print("$it ") }
}

fun printArray(arr: IntArray) {
    print("Array ")
    arr.forEach { print("$it ") }
}