package kotlinLanguage.tree


class Insertion {
    /*todo: [ Insertion in Binary Search Tree using Recursion ]
    *  How to Insert a value in a Binary Search Tree:
        A new key is always inserted at the leaf by maintaining the property of the binary search tree.
        We start searching for a key from the root until we hit a leaf node. Once a leaf node is found,
        the new node is added as a child of the leaf node. The below steps are followed
        while we try to insert a node into a binary search tree:
       Steps : --
        * Initialize the current node (say, currNode or node) with root node
        * Compare the key with the current node.
        * Move left if the key is less than or equal to the current node value.
        * Move right if the key is greater than current node value.
        * Repeat steps 2 and 3 until you reach a leaf node.
        * Attach the new key as a left or right child based on the comparison with the leaf node’s value.
        * */

    fun insertionInBSTRecursion(root: BinaryTreeNode<Int>?, key: Int): BinaryTreeNode<Int> {
        if (root == null) return BinaryTreeNode(key)

        if (key == root.data) {
            throw IllegalArgumentException("Duplicate Node Exception: Node already present")
        }

        if (root.data < key)
            root.rightNode = insertionInBSTRecursion(root.rightNode, key)

        if (root.data > key)
            root.leftNode = insertionInBSTRecursion(root.leftNode, key)

        return root
    }

    /*todo: [ Iterative Method ]
       To insert the node into the binary search tree, we need to compare the node with the tree’s root. If the node is greater than the root value, we move to the right side of the binary search tree; otherwise, we move to the left side of the binary search tree. We will follow this process until we reach any leaf value, then we create a new node and attach it to the leaf of the tree. A condition that needs to handle when the tree is empty, the node is made the root of the binary search tree. Therefore we insert a node in the binary search tree.
         Algorithm
        * We will create a new node with the given value.
        * To insert the node in BST, compare it with the root node.
        * If the node is greater than the root node, move to the right subtree, otherwise proceed to the left subtree.
        * Follow this process until we reach the leaf node.
        * Now we will attach the node with the leaf node; if the value of a node is greater than the leaf node, it will attach to the right side of the leaf node. Otherwise, it will attach to the left side of the leaf node.
        * The base case needs to be handled separately, i.e., if the BST is empty, the node to be inserted will become the root of the current BST.
    * */

    fun insertionInIterative(root: BinaryTreeNode<Int>, key: Int) {
        val newNode = BinaryTreeNode(key)

        var current: BinaryTreeNode<Int> = root

        while (true) {
            if (current.data == key) {
                throw IllegalArgumentException("Duplicate Node Exception: Node already present")
            }

            if (current.data < key) {
                if (current.rightNode == null) {
                    current.rightNode = newNode
                    break
                }
                current = current.rightNode!!
            } else { // data > key
                if (current.leftNode == null) {
                    current.leftNode = newNode
                    break
                }
                current = current.leftNode!!
            }
        }

    }

    fun itrInsertion(root: BinaryTreeNode<Int>?, key: Int) {

        var current = root
        var parentNode: BinaryTreeNode<Int>? = null

        while (current != null) {
            parentNode = current

            if (current.data == key)
                throw IllegalArgumentException("Duplicate Node Exception: Node already present")

            current = if (current.data < key) current.rightNode else current.leftNode
        }

        parentNode?.let {
            if (it.data < key) it.rightNode = BinaryTreeNode(key)
            else if (it.data > key) it.leftNode = BinaryTreeNode(key)
            else throw IllegalArgumentException("Duplicate Node Exception: Node already present")
        }
    }

}
