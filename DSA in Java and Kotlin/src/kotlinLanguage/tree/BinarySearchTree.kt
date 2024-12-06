package dsa.tree

import kotlinLanguage.tree.BinaryTreeNode


class BinarySearchTree {
    //todo: rec - recursion
    //      itr - iterative way
    var head: BinaryTreeNode<Int>? = null

    companion object {
        val demoBSTRoot: BinaryTreeNode<Int>
            get() {
                val bst = BinaryTreeNode(25)

                val l1 = BinaryTreeNode(20)
                val r1 = BinaryTreeNode(36)
                bst.leftNode = l1; bst.rightNode = r1

                val l11 = BinaryTreeNode(10)
                val l12 = BinaryTreeNode(22)
                l1.leftNode = l11; l1.rightNode = l12

                val r11 = BinaryTreeNode(30)
                val r12 = BinaryTreeNode(40)
                r1.leftNode = r11; r1.rightNode = r12


                val l111 = BinaryTreeNode(5)
                val l112 = BinaryTreeNode(12)
                l11.leftNode = l111; l11.rightNode = l112

                val r111 = BinaryTreeNode(28)
                r11.leftNode = r111

                val r121 = BinaryTreeNode(38)
                val r122 = BinaryTreeNode(48)
                r12.leftNode = r121; r12.rightNode = r122

                return bst
            }
    }

    //todo: Is BST -> InOrder Traverse & check { Previous < Next  => Created array is in sortedWay }
    //  InOrder ->  Left -> Root -> Right

    private fun getMax(root: BinaryTreeNode<Int>?): Int {
        root?.let {
            var current = it.data
            val left = getMax(it.leftNode)
            val right = getMax(it.rightNode)

            if (left > current) current = left
            if (right > current) current = right

            return current
        }
        return Int.MIN_VALUE
    }

    private fun getMin(root: BinaryTreeNode<Int>?): Int {
        root?.let {
            var current = it.data
            val left = getMin(it.leftNode)
            val right = getMin(it.rightNode)

            if (left < current) current = left
            if (right < current) current = right

            return current

        }
        return Int.MAX_VALUE
    }

    /*todo: Approach - 1
    *   Brute Force Approach :
            A straightforward approach to check if a binary tree is BST or not is to check at every node, the maximum value in the left subtree is less than the current node’s value, and the minimum value in the right subtree is greater than the current node’s value.
            Step 1. Go to the left subtree and get the Maximum value from the left subtree.
            Step 2. Check if the max value of the left subtree is more than the current node value, then return false.
            Step 3.  Check if the minimum value of the right subtree is less than the current node value, then return false.
            Step 4. Recursively, follow steps 2 and 3 for the left and right subtree.
    */
    fun checkIsBSTApproach1(root: BinaryTreeNode<Int>?): Boolean {
        //base case
        if (root == null) return true

        if (getMax(root.leftNode) > root.data) {
            println("Left Node is Greater : ${getMax(root.leftNode)} : root : ${root.data}")
            return false
        }
        if (getMin(root.rightNode) < root.data) {
            println("Right Node is lesser ${getMin(root.rightNode)} : root : ${root.data}")
            return false
        }

//        if (!recCheckIsBST(root.leftNode) || !recCheckIsBST(root.rightNode)) return false

        return checkIsBSTApproach1(root.leftNode) && checkIsBSTApproach1(root.rightNode)
    }

    fun printInOrder(root: BinaryTreeNode<Int>?) {
        if (root == null) return

        printInOrder(root.leftNode)
        print("${root.data} ")
        printInOrder(root.rightNode)
    }

    /*/todo": Approach - 2
    *   Better Approach
            The approach discussed above is inefficient in terms of time and space complexity for checking if a binary tree is BST or not,
            as we were iterating over the same node multiple times to get min and max values.
            A better approach is to pass the min and max information to every node while traversing the nodes.
            In this way, we can avoid traversing the same node again and again.
         * Step 1. Create a function that takes the root node, left min node, and right max node.
         * Step 2. Check if the current node’s value is within the limit or not. If not, then return false.
         * Step 3. Go to the left and right subtree by narrowing down the min and max node’s value allowed.
         * Step 4. Return true if left and right subtrees are also BST.
    */
    fun checkBSTApproach2(root: BinaryTreeNode<Int>?): Boolean {
        return isBST(root, null, null)
    }

    private fun isBST(
        root: BinaryTreeNode<Int>?,
        leftMin: BinaryTreeNode<Int>?,
        rightMax: BinaryTreeNode<Int>?
    ): Boolean {
        if (root == null) return true

        if (leftMin != null && leftMin.data >= root.data) return false
        if (rightMax != null && rightMax.data <= root.data) return false

        println(" Root : ${root.data}, LeftMin : ${leftMin?.data} : RightMax : ${rightMax?.data}")
        return isBST(root.leftNode, leftMin, root) && isBST(root.rightNode, root, rightMax)
    }

    /*todo: Approach - 3
     *  Efficient Approach
        To understand the efficient approach to check if a binary tree is BST or not,
        we have to understand one property of binary search trees. If we do Inorder traversal of the binary search tree,
        then we get sorted data. We can use this property to solve this problem efficiently.
        By traversing the tree in the Inorder schema and checking that the previous node’s value is smaller than the current node's value,
        we can conclude the binary tree is BST. With this approach, our time complexity will be O(N) and will use O(1) space.
        Therefore it’s an efficient approach to check if the binary tree is BST or not.
         Algorithm-
        * Step 1. Declare an instance-level variable previous and initialize it to null.
        * Step 2. Traverse the tree in an Inorder fashion.
        * Step 3. If the previous value is null, then set it to the current node.
        * Step 4. If the previous value is not null, then compare it with the current node.
        * Step 5. If the previous value is larger than the value of the current node, then returns false.
        * Step 6. Repeat Steps 3-5 for every node.
        * */

    fun checkBSTApproach3(root: BinaryTreeNode<Int>?): Boolean {
        var previous: BinaryTreeNode<Int>? = null

        fun isBST(root: BinaryTreeNode<Int>?): Boolean {
            //base case
            if (root == null) return true

            if (!isBST(root.leftNode)) {
                return false
            }

            previous?.let { if (it.data > root.data) return false }
            previous = root

            return isBST(root.rightNode)
        }

        return isBST(root)
    }


}
