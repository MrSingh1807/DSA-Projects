package kotlinLanguage.tree

fun main() {

    val tree: BinaryTree<Int> = BinaryTreeImpl()
//    tree.passTree(tree.createIntegerTree()!!)
    tree.passTree(demoTree())


//    tree.preOrderTraverse()
    println()
    tree.levelOrderTraverse()

 /*   print("PreOrder -> ")
    tree.preOrderTraverse()
    println()

    print("Post Order -> ")
    tree.postOrderTraverse()
    println()

    print("In Order -> ")
    tree.inOrderTraverse()
    println()
*/
}

fun demoTree(): BinaryTreeNode<Int> {
    /*todo:
    *           3
    *         /   \
    *       2       5
    *      / \     / \
    *     6   7   8   9
    *      Traversal ->
    *           PreOrder ->  3 2 6 7 5 8 9
    *           PostOrder -> 6 7 2 8 9 5 3
    *           InOrder -> 6 2 7 3 8 5 9
    *           Level Order -> 3 2 5 6 7 8 9
    *
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

    val dualSubChild1 = BinaryTreeNode(10)
    val dualSubChild2 = BinaryTreeNode(11)
    val dualSubChild3 = BinaryTreeNode(12)
    val dualSubChild4 = BinaryTreeNode(13)
    val dualSubChild5 = BinaryTreeNode(14)
    val dualSubChild6 = BinaryTreeNode(15)
    val dualSubChild7 = BinaryTreeNode(16)
    val dualSubChild8 = BinaryTreeNode(17)

    subChild1.leftNode = dualSubChild1
    subChild1.rightNode = dualSubChild2

    subChild2.leftNode = dualSubChild3
    subChild2.rightNode = dualSubChild4

    subChild3.leftNode = dualSubChild5
    subChild3.rightNode = dualSubChild6

    subChild4.leftNode = dualSubChild7
    subChild4.rightNode = dualSubChild8

    return root
}

