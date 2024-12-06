package kotlinLanguage.tree


class Searching {

    //todo: Done
    fun recSearching(root: BinaryTreeNode<Int>?, value: Int): Boolean {
        if (root == null) return false

        if (root.data == value) return true
        return recSearching(root.leftNode, value) || recSearching(root.rightNode, value)
    }


    fun itrSearching(root: BinaryTreeNode<Int>?, key: Int): Boolean {
        var current = root

        while (current != null) {
            if (current.data == key) return true

            current = if (current.data < key) current.rightNode else current.leftNode
        }

        return false
    }

}