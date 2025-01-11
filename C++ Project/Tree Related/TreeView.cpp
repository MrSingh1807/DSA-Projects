#include <iostream>
#include "../Node.h"
#include <vector>
#include <map>
using namespace std;

void rightTraverse(Node *root, vector<int> &stack)
{
    // base case
    if (root == NULL)
        return;
    rightTraverse(root->right, stack);
    stack.push_back(root->key);
}

void leftTraverse(Node *root, vector<int> &stack)
{
    // base case
    if (root == NULL)
        return;
    leftTraverse(root->left, stack);
    stack.push_back(root->key);
}

void topViewImpl(Node *root, int hd, map<int, vector<int>> &treeMap)
{
    // base case
    if (root == NULL)
        return;
    treeMap[hd].push_back(root->key);

    topViewImpl(root->left, hd - 1, treeMap);
    topViewImpl(root->right, hd + 1, treeMap);
}
vector<int> topView(Node *root)
{
    vector<int> stack;
    map<int, vector<int>> view;
    topViewImpl(binaryTree, 0, view);

    for (auto &viewMap : view)
    {
        stack.push_back(viewMap.second[0]);
    }
    return stack;
}

void bottomView(Node *root)
{
}

void leftView(Node *root)
{
}

void rightView(Node *root)
{
}

Node *binaryTree = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));

int main(int argc, char const *argv[])
{
    vector<int> view;
    view = topView(binaryTree);

    cout << "Size : " << view.size() <<endl;
    for (int i = 0; i < view.size(); i++)
    {
        cout << view[i] << " ";
    }


    return 0;
}
