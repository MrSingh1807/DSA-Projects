package kotlinLanguage.tree

interface BinaryTree<T: Any> {
    fun create()
}

interface TraverseInTree {
    fun preOrderTraverse()
    fun postOrderTraverse()
    fun inOrderTraverse()
}

class BinaryTreeImpl<T : Any> : BinaryTree<T>, TraverseInTree {
    
    override fun create() {
        
    }

    override fun preOrderTraverse() {
        
    }

    override fun postOrderTraverse() {
        
    }

    override fun inOrderTraverse() {
        
    }
    
}

