package kotlinLanguage.linkedList


fun main() {
    val nums = LinkedList<Int>()

    nums.append(2)
    nums.append(4)
    nums.append(4)
    nums.append(4)
    nums.append(5)
    nums.append(5)

    removeDuplicateApproach2(nums)
//    removeDuplicates(nums)
    println(nums)

}

fun printLL(nums: LinkedList<Int>) {
    var current = nums.head

    while (current != null) {
        println(current.value)
        current = current.next
    }
}

//todo: From a sorted LL
fun removeDuplicates(nums: LinkedList<Int>) {
    var current = nums.head

    while (current != null) {
        val next = current.next

        if (current.value == next?.value) current.next = next.next
        else current = next
    }
}

//todo: From a Unsorted LL
fun removeDuplicateApproach1(nums: LinkedList<Int>) {
    //todo: Double Iteration


}

//todo: From a Unsorted LL

fun removeDuplicateApproach2(nums: LinkedList<Int>) {
//    todo: using Map object

    val isDuplicate = mutableMapOf<Int, Boolean>()
    var current = nums.head

    while (current != null) {
        if (isDuplicate[current.value] == true) {
//            val nextNext = current.next?.next
            current = current.next?.next
        } else {
            isDuplicate[current.value] = true
            current = current.next
        }

    }
}






















