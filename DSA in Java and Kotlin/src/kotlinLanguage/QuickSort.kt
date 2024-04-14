package kotlinLanguage

fun main() {
    val arr = intArrayOf(-4,0,7,4,9,-5,-1,0,-7,-1)


    quickSort(arr, 0, arr.lastIndex)

    printArray(arr)

}

fun quickSort(nums: IntArray, s: Int, e: Int) {
    //base case
    if (s >= e) return

    val p = partition(nums, s, e)

    // sort left part
    quickSort(nums, s, p - 1)

    // sort right part
    quickSort(nums, p + 1, e)
}

fun partition(nums: IntArray, s: Int, e: Int): Int {
    val pivot = nums[s]
    var count = 0

    //todo: Check Pivot
    for (i in s + 1..e) {
        if (nums[i] <= pivot) count++
    }

    val pivotIndex = s + count

    //todo: Place pivot element at correct place
    nums[s] = nums[pivotIndex]
    nums[pivotIndex] = pivot

    //todo: make smaller elements lie before pivot & larger elements after pivot
    var strIndex = s
    var endIndex = e

    while (pivotIndex in (strIndex + 1)..<endIndex) {

        //move strIndex++ till we find element greater than pivot element in left side
        while (nums[strIndex] <= pivot) strIndex++

        //move endIndex-- till we find smaller elements than pivot in right side
        while (nums[endIndex] > pivot) endIndex--

        while (pivotIndex in (strIndex + 1)..<endIndex) {
            val temp = nums[strIndex]
            nums[strIndex++] = nums[endIndex]
            nums[endIndex--] = temp
        }
    }

    return pivotIndex
}

