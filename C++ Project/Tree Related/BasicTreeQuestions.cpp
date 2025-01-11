#include <iostream>
#include "../Node.h"
using namespace std;

int height(Node *root)
{
    // base case
    if (root == NULL)
        return -1;

    int leftHeight = height(root->left);
    int rightHeight = height(root->right);

    return max(leftHeight, rightHeight) + 1;
}

int diameter(Node *root)
{
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);

    return leftHeight + rightHeight + 1;
}

bool checkIdenticialTreeOrNot(Node *root1, Node *root2)
{
    // base case
    if (root1 == NULL && root2 == NULL)
        return true;
    if (root1 != NULL && root2 == NULL)
        return false;
    if (root1 == NULL && root2 != NULL)
        return false;

    if (root1->key == root2->key)
        return true;
    else
        return false;

    return checkIdenticialTreeOrNot(root1->left, root2->left) && checkIdenticialTreeOrNot(root1->right, root2->right);
}

bool checkSUM(Node *root)
{
    // condition satisfied with => root.key == root.left.key + root.right.key

    // base case
    if (root == NULL || root->left == NULL && root->right == NULL)
        return true;

    int sum = 0;
    if (root->left != NULL)
        sum += root->left->key;

    if (root->right != NULL)
        sum += root->right->key;

    return root->key == sum && checkSUM(root->left) && checkSUM(root->right);
}

pair<bool, int> isSum(Node *root) //second approach
{
    // base case
    pair<bool, int> basePair;

    if (root == NULL || root->left == NULL && root->right == NULL)
    {
        basePair.first = true;
        basePair.second = 0;
        return basePair;
    }

    int sum = 0;
    if (root->left != nullptr)
        sum += root->left->key;

    if (root->right != nullptr)
        sum += root->right->key;

    pair<bool, int> leftPair = isSum(root->left);
    pair<bool, int> rightPair = isSum(root->right);

    pair<bool, int> result;
    result.first = (root->key == leftPair.second + rightPair.second);
    result.second = sum;
    return result;
}

int main(int argc, char const *argv[])
{
    Node *node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3));
    // cout << height(node) << endl;
    // cout << "diameter :- " << diameter(node) << endl;

    cout << "Check Identical : " << checkIdenticialTreeOrNot(node, node) << endl;

    Node *root = new Node(35);
    root->left = new Node(20);
    root->right = new Node(15);
    root->left->left = new Node(15);
    root->left->right = new Node(5);
    root->right->left = new Node(10);
    root->right->right = new Node(5);

    cout << "Check Sum Tree : " << isSum(root).first;
    return 0;
}
