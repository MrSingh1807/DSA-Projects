package kotlinLanguage.linkedList

fun main() {

    val nums = LinkedList<Int>()
    nums.also { num ->
        (1..6).forEach {
            num.append(it)
        }
    }


    var head = nums.head
    while (head != null) {
        println(head.value)
        head = head.next
    }

    println(nums.detectCycle())
}

fun makeCircular(nums : LinkedList<Int>) {
    val first = nums.head
    var last = nums.head

    while (last != null) last = last.next
    last?.next = first?.next
}

fun LinkedList<Int>.detectCycle(): Boolean {
    var slow = head
    var fast = head?.next

    val isVisited = mutableMapOf<Int, Boolean>()

    if (slow != null) {
        if (fast == null) return false
        if (isVisited[slow.value] == true) return true

        isVisited[slow.value] = true
        isVisited[fast.value] = true

        slow = slow.next
        fast = fast.next?.next
    }

    return false
}