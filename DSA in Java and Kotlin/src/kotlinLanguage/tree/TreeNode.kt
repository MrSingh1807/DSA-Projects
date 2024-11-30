package kotlinLanguage.tree

data class TreeNode<T>(
    var data : T,
    var nodes : List<TreeNode<T>>? = null
)
