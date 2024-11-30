package kotlinLanguage.tree

data class BinaryTreeNode<T>(
    var data : T,
    var leftNode : BinaryTreeNode<T>? = null,
    var rightNode : BinaryTreeNode<T>? = null
)

