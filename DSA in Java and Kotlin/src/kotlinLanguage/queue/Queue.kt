package kotlinLanguage.queue

class Queue<T> {

    private val list = ArrayList<T>()

    val size : Int
        get() = list.size

    val isNotEmpty : Boolean
        get() = list.isNotEmpty()


    fun enqueue(data : T){
        list.add(data)
    }

    fun enqueueAt(data: T, index : Int) {
        list.add(index, data)
    }

    fun enqueueFirst(data: T) {
        list.add(0, data)
    }

    fun dequeue() : T {
        list.ifEmpty { throw ArrayIndexOutOfBoundsException("Queue can't size is empty") }
       return list.removeAt(0)
    }


}