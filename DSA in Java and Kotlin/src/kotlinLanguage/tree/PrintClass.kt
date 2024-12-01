package kotlinLanguage.tree

import javax.swing.plaf.basic.BasicTreeUI

fun main() {

    val tree: BinaryTree<Int> = BinaryTreeImpl()
    tree.passTree(demoTree())

    print("PreOrder -> ")
    tree.preOrderTraverse()
    println()

    print("Post Order -> ")
    tree.postOrderTraverse()
    println()

    print("In Order -> ")
    tree.inOrderTraverse()
    println()

}

fun demoTree(): BinaryTreeNode<Int> {
    /*todo:
    *           3
    *         /   \
    *       2       5
    *      / \     / \
    *     6   7   8   9
    * */

    val root = BinaryTreeNode(3)
    val child1 = BinaryTreeNode(2)
    val child2 = BinaryTreeNode(5)
    root.leftNode = child1
    root.rightNode = child2

    val subChild1 = BinaryTreeNode(6)
    val subChild2 = BinaryTreeNode(7)
    child1.leftNode = subChild1
    child1.rightNode = subChild2
    val subChild3 = BinaryTreeNode(8)
    val subChild4 = BinaryTreeNode(9)
    child2.leftNode = subChild3
    child2.rightNode = subChild4

    return root
}

