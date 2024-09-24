package kotlinLanguage.linkedList

import kotlin.concurrent.thread

fun main() {

//    val nums = LinkedList<Int>()
//    nums.also { num ->
//        (1..6).forEach {
//            num.append(it)
//        }
//    }
//
//    nums.splitLL()
    println(Thread.currentThread().name)

    val runnable = Runnable { }

    thread(start = true) {
        println(Thread.currentThread().name)
    }

    thread {
        println(Thread.currentThread().name)
    }
}

fun LinkedList<Int>.splitLL() {

    var slow = head
    var fast = head?.next

    var middle = 0
    while (fast != null) {
        slow = slow?.next
        fast = fast.next?.next
        middle++
    }


    var first = head
    var second = head

    var cHead = head
    var current = 0
    while (cHead != null) {
        cHead = cHead.next

        if (current < middle) first = cHead
        else second = cHead

        current++
    }

    println(first)
    println(second)

}