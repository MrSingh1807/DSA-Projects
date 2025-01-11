#include <iostream>
#include "Node.h"
using namespace std;

// Traversal
void inOrder(Node *root)
{
    //left - root - right
    //base case 
    if (root == NULL) return;
    
    inOrder(root->left);
    cout << root->key << " ";
    inOrder(root->right);
}
void preOrder(Node *root)
{
    // root -> left -> right

    // base case
    if (root == nullptr)
        return;

    cout << root->key << " ";
    preOrder(root->left);
    preOrder(root->right);
}
void postOrder(Node *root)
{
    // root -> left -> right

    // base case
    if (root == nullptr)
        return;

    postOrder(root->left);
    postOrder(root->right);
    cout << root->key << " ";
}

int main(int argc, char const *argv[])
{
    inOrder(largeBST());
    return 0;
}
