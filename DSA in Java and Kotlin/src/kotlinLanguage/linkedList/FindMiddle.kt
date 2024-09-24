package kotlinLanguage.linkedList

fun main() {
    val nums = LinkedList<Int>()
    nums.also { num->
        (1..6).forEach {
            num.append(it)
        }
    }

    println(nums)

    println(findMiddle(nums)?.value)

}

fun findMiddle(nums: LinkedList<Int>): Node<Int>? {
    var slow = nums.head
    var fast =  nums.head?.next

    while (fast != null){
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}
