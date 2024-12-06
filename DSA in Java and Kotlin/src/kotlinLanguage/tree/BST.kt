package kotlinLanguage.tree

/*todo:
*    BST : [ Binary Search Tree ]
*    Properties ->
*   1. All nodes of left subtree are lesser.
*   2. All nodes of right subtree are greater.
*   3. Left and right subtree are also BST
*   4. There are no Duplicates.
*   5. InOrder Traversal ub BST gives an ascending sorted array.
*   .
*   Basic Operations in BST :-
*   > Searching in BST
*   > Insertion in BST
*   > Deletion a node in BST
*       - The Node is a leaf  node.
*       - The Node is non leaf node.
*       - The Node is the root node.
*     => for case 2 & 3 -
*       When delete a node replace empty space with - inOrder Pre
*                                                   - inOder Post
*
*  */

class BST<T> {
    //todo: Itr : Iterative way
    //  rec: recursion way

    private var head: BinaryTreeNode<T>? = null


    fun passTree(head: BinaryTreeNode<T>) {
        this.head = head
    }

    fun recCheckIsBST(root: BinaryTreeNode<T>?): Boolean {
        //todo: InOrderTraversal and check previous < next

        var previousNode: BinaryTreeNode<T>? = null

        root?.let {


        }

        return true
    }

    fun itrCheckIsBST(): Boolean {


        return false
    }

    fun recSearchInBST(data: T): Boolean {


        return false
    }

    fun itrSearchInBST(data: T): Boolean {


        return false
    }

    fun recInsertion(data: T) {

    }

    fun itrInsertion(data: T) {

    }

    fun recDeleting(data: T) {


    }

    fun itrDeleting(data: T) {


    }


}
