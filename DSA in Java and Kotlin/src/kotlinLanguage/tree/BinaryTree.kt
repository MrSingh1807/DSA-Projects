package kotlinLanguage.tree

import java.util.Scanner

interface BinaryTree<T : Any> {

    fun passTree(head: BinaryTreeNode<T>)
    fun createIntegerTree(): BinaryTreeNode<Int>?

    fun preOrderTraverse()
    fun postOrderTraverse()
    fun inOrderTraverse()
}


class BinaryTreeImpl<T : Any> : BinaryTree<T> {

    private var head: BinaryTreeNode<T>? = null
    private val scanner = Scanner(System.`in`)

    override fun passTree(head: BinaryTreeNode<T>) {
        this.head = head
    }

    override fun createIntegerTree(): BinaryTreeNode<Int>? {
        println("Enter the data : ")
        var data: Int = scanner.nextInt()

        //base case
        if (data == -1) return null

        // Create the node with the given data
        val root = BinaryTreeNode(data = data)

        println("Enter data for left Node of $data :- ")
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

    override fun preOrderTraverse() {
        //todo : Root -> Left Part -> Right
        preOrder(head)
    }

    private fun postOrder(root: BinaryTreeNode<T>?) {
        root?.let {
            postOrder(it.leftNode)
            postOrder(it.rightNode)
            print(" ${it.data}")
        }
    }

    override fun postOrderTraverse() {
        //todo: Left Part ->  Right Part ->  Root
        postOrder(head)
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
        inOrder(head)
    }


}

