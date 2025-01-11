#ifndef NODE_H
#define NODE_H

struct Node
{
    int key;
    Node *left;
    Node *right;

    // Constructor
    Node(int value, Node *leftNode = nullptr, Node *rightNode = nullptr)
        : key(value), left(leftNode), right(rightNode) {}
};

Node *largeBST()
{
    Node *root = new Node(25);
    Node *left1 = new Node(20);
    Node *right1 = new Node(36);
    root->left = left1;
    root->right = right1;

    Node *left11 = new Node(10, new Node(5, new Node(1), new Node(8)), new Node(12, NULL, new Node(15)));
    Node *left12 = new Node(22);
    Node *right11 = new Node(30, new Node(28));
    Node *right12 = new Node(40, new Node(38), new Node(48, new Node(45), new Node(50)));
    left1->left = left11;
    left1->right = left12;
    right1->left = right11;
    right1->right = right12;

    return root;
}

Node *smallBST()
{
    Node *root = new Node(9);
    Node *left = new Node(8);
    Node *right = new Node(15, new Node(11), new Node(20));

    root->left = left;
    root->right = right;
    return root;
}


#endif // NODE_H
