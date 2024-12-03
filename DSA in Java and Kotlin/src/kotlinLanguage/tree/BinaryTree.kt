package kotlinLanguage.tree

import kotlinLanguage.queue.Queue
import java.util.Scanner

/* todo:
*
*
* */

interface BinaryTree<T : Any> {

    fun passTree(head: BinaryTreeNode<T>)
    fun createIntegerTree(): BinaryTreeNode<Int>?

    fun preOrderTraverse()
    fun postOrderTraverse()
    fun inOrderTraverse()
    fun levelOrderTraverse()
}


class BinaryTreeImpl<T : Any> : BinaryTree<T> {

    private var head: BinaryTreeNode<T>? = null
    private val scanner = Scanner(System.`in`)

    override fun passTree(head: BinaryTreeNode<T>) {
        this.head = head
    }

    override fun createIntegerTree(): BinaryTreeNode<Int>? {
        print("Enter the data : ")
        var data: Int = scanner.nextInt()

        //base case
        if (data == -1) return null

        // Create the node with the given data
        val root = BinaryTreeNode(data = data)

        println("Enter data for left Node of $data ")
        root.leftNode = createIntegerTree()

        println("Enter data for right Node of $data :- ")
        root.rightNode = createIntegerTree()

        return root
    }

    private fun preOrder(root: BinaryTreeNode<T>?) {
        root?.let {
            print(" ${it.data}")
            preOrder(it.leftNode)
            preOrder(it.rightNode)
        }
    }

    private fun preOrderTraverseIterate() {
        //todo : Root -> Left Part -> Right

        val treeQueue = Queue<BinaryTreeNode<T>>()
        treeQueue.enqueue(head!!)

        print("Tree PreOrder -> ")
        while (treeQueue.isNotEmpty) {
            val currentNode = treeQueue.dequeue()
            print("${currentNode.data} ")

            currentNode.rightNode?.let { treeQueue.enqueueFirst(it) } // Add at First
            currentNode.leftNode?.let { treeQueue.enqueueFirst(it) } // Add at First
        }

    }

    override fun preOrderTraverse() {
        //todo : Root -> Left Part -> Right
//        preOrder(head)
        preOrderTraverseIterate()
    }

    private fun postOrder(root: BinaryTreeNode<T>?) {
        root?.let {
            postOrder(it.leftNode)
            postOrder(it.rightNode)
            print(" ${it.data}")
        }
    }

    private fun postOrderIterate() {
        //todo: Left ->  Right ->  Root

        val treeQue = Queue<BinaryTreeNode<T>>()
        treeQue.enqueue(head!!)

        val tree = ArrayList<T>()

        println()
        while (treeQue.isNotEmpty) {
            val currentNode = treeQue.dequeue()
            tree.addFirst(currentNode.data)

            currentNode.leftNode?.let { treeQue.enqueueFirst(it) }
            currentNode.rightNode?.let { treeQue.enqueueFirst(it) }
            println("CurrentNode : ${currentNode.data} : Left -> ${currentNode.leftNode?.data} : Right -> ${currentNode.rightNode?.data}")
        }
        println()

        print("Post Order -> ")
        for (i in 0 until tree.size) {
            print("${tree[i]} ")
        }

    }

    override fun postOrderTraverse() {
        //todo: Left Part ->  Right Part ->  Root
        postOrderIterate()

        println("\n pOst Order Recur : ")
        postOrder(head)
    }

    private fun inOrderIterate() {
        //todo: Left Part -> Root  -> Right Part

        val treeQue = Queue<BinaryTreeNode<T>>()
        val tree = ArrayList<T>()

        var currentNode = head

        while (currentNode != null || treeQue.isNotEmpty) {
            // Traverse the left subtree
            while (currentNode != null) {
                treeQue.enqueueFirst(currentNode)
                currentNode = currentNode.leftNode
            }

            // Process the node
            currentNode = treeQue.dequeue()
            tree.add(currentNode.data)

            // Traverse the right subtree
            currentNode = currentNode.rightNode
        }

        print("In OrderItr -> ")
        tree.forEach {
            print("$it ")
        }

    }

    private fun inOrder(root: BinaryTreeNode<T>?) {
        root?.let {
            inOrder(it.leftNode)
            print(" ${it.data}")
            inOrder(it.rightNode)
        }
    }

    override fun inOrderTraverse() {
        //todo: Left Part -> Root  -> Right Part

        inOrderIterate()
        println()
        inOrder(head)
    }

    private fun levelOrderIterate() {

        val treeQue = Queue<BinaryTreeNode<T>>()
        treeQue.enqueue(head!!)

        val tree = ArrayList<T>()
//        tree.add(head!!.data)

        while (treeQue.isNotEmpty) {
            val currentNode = treeQue.dequeue()
            tree.add(currentNode.data)

            // Enqueue left and right children
            currentNode.leftNode?.let { treeQue.enqueue(it) }
            currentNode.rightNode?.let { treeQue.enqueue(it) }
        }

        print("Level Order Traverse -> ")
        tree.forEach { t ->
            print("$t " )
        }
    }

    private fun levelOrder(root : BinaryTreeNode<T>?){
        root?.let {

        }
    }

    override fun levelOrderTraverse() {
        levelOrderIterate()
    }

}

