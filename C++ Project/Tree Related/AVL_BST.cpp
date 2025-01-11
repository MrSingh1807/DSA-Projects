#include <iostream>
using namespace std;
// #include "Node.h"


/*
template <typename T>

// AVL : Binary Search Tree [BST]
struct Node
{
    T key;
    Node *left;
    Node *right;

    // Constructor
    Node(T value, Node *leftNode = NULL, Node *rightNode = NULL)
        : key(value), left(leftNode), right(rightNode) {}
};

*/

struct Node
{
    int key;
    Node *left;
    Node *right;

    // Constructor
    Node(int value, Node *leftNode = NULL, Node *rightNode = NULL)
        : key(value), left(leftNode), right(rightNode) {}
};

class AVL
{

public:
    int getHeight(Node *root)
    {
        // base case
        if (root == NULL)
            return -1;
        return 1 + max(getHeight(root->left), getHeight(root->right));
    }
    int bf(Node *node)   //Balanced Factor : It can be [ -1 , 0 , +1 ] for ideal AVL Tree
    {
        //base case
        if (node == nullptr) return 0;
        return getHeight(node->right) - getHeight(node->left);
    }

    // Rotations
    Node *llRotation(Node *root) // Left - Left Rotation
    {
    }

    Node *rrRotation(Node *root) // Right - Right Rotation
    {
    }

    Node *lrRotation(Node *root) // Left - Left Rotation
    {
    }

    Node *rlRotation(Node *root) // Right - Left Rotation
    {
    }

    // Insertation
    Node *insert(Node *root, int key)
    {
    }
};

int main(int argc, char const *argv[])
{
    // Node *root = smallBST();
    AVL avlOperation = AVL();
    // cout << root->right->key << endl;

    Node *largeBF = new Node(5, new Node(10, new Node(12, new Node(15))));

    // cout<<"Small Tree Height " <<avlOperation.getHeight(smallBST()) << endl;
    // cout << "Large Tree Height " << avlOperation.getHeight(largeBST()) << endl;

    cout << "Check Balanced Factor : " << avlOperation.bf(largeBF) << endl; 
    return 0;
}
