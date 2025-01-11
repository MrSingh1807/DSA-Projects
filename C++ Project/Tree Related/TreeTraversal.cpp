#include <iostream>
#include "../Node.h"
#include <queue>
#include <map>

using namespace std;

void zigZagTraversal(Node *root)
{
    if (root == NULL)
        return;

    vector<int> zigZagKeys;

    queue<pair<int, Node *>> travers; // [ level - Node ]
    travers.push({0, root});

    while (!travers.empty())
    {
        pair<int, Node *> current = travers.front();
        travers.pop();
        zigZagKeys.push_back(current.second->key);

        cout << "Pair Value = First : " << current.first << " , Second : " << current.second->key << endl;
        if (current.first % 2) // 1 -> Odd Case -- R L traverse
        {
            if (current.second->right != nullptr)
                travers.push({current.first + 1, current.second->right});
            if (current.second->left != nullptr)
                travers.push({current.first + 1, current.second->left});
        }
        else // == 0 -> Even Case -- LR traverse
        {

            if (current.second->right != nullptr)
                travers.push({current.first + 1, current.second->right});

            if (current.second->left != nullptr)
                travers.push({current.first + 1, current.second->left});
        }
    }

    for (int i = 0; i < zigZagKeys.size(); i++)
    {
        cout << zigZagKeys[i] << " ";
    }
}

void leftBoundry(Node *root, vector<int> &boundry)
{
    if (root->left == NULL || root->right == NULL)
        return;

    if (root->left != NULL)
    {
        boundry.push_back(root->key);
        leftBoundry(root->left, boundry);
    }
    else
    {
        boundry.push_back(root->key);
        leftBoundry(root->right, boundry);
    }
}
void leafBoundy(Node *root, vector<int> &boundry)
{
    if (root == NULL)
        return;

    leafBoundy(root->left, boundry);
    leafBoundy(root->right, boundry);

    if (root->left == NULL || root->right == NULL)
        boundry.push_back(root->key);
}
void rightBoundy(Node *root, vector<int> &boundry)
{
    if (root->left == NULL || root->right == NULL)
        return;

    if (root->right != NULL)
    {
        rightBoundy(root->right, boundry);
        boundry.push_back(root->key);
    }
    else
    {
        rightBoundy(root->left, boundry);
        boundry.push_back(root->key);
    }
}

void boundryTrav(Node *root, vector<int> &boundry)
{
    // approach  : Steps
    // 1. Left Side traverse - except  leaf node
    // 2. All Leaf Nodes form left to right - [pre Order, inOrder ]
    // 3. Right Side traver - reversely : except leaf node & root node

    // base case
    if (root == nullptr)
        return;

    // Step 1
    leftBoundry(root, boundry);

    // Step 2
    leafBoundy(root, boundry);

    // Step 3
    rightBoundy(root, boundry);

    boundry.pop_back();
}

void verticalOrderTraverse(Node *root, int hd, int level, map<int, map<int, vector<int>>> &order)
{
    // base case
    if (root == NULL)
        return;

    order[hd][level].push_back(root->key);

    // cout<< "HD : " << hd << " level : " << level << " last vector value : " << order[hd][level].back() << endl;
    verticalOrderTraverse(root->left, hd - 1, level + 1, order);
    verticalOrderTraverse(root->right, hd + 1, level + 1, order);
}

vector<vector<int>> verticalTraversal(Node *root)
{
    // First int - Horizonal Displacement, Second int - Level [height], 3rd int - node value in vector
    map<int, map<int, vector<int>>> resultant;
    // if (root == NULL) return resultant;
    // resultant[0][0].push_back(root->key);

    verticalOrderTraverse(root, 0, 0, resultant);

    vector<vector<int>> result;

    // Traverse the resultant map
    for (auto &hdMap : resultant)
    {
        for (auto &levelMap : hdMap.second)
        {
            int levelIndex = levelMap.first;
            if (result.size() >= levelIndex)
            {
                for (int k = 0; k < levelMap.second.size(); k++)
                {
                    result[levelIndex].push_back(levelMap.second[k]);
                }
            }
            else
            {
                result.push_back(levelMap.second);
            }
        }
    }

    return result;
}

Node *baseRoot()
{
    Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(4);

    root->left->left = new Node(3);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    root->left->left->left = new Node(8);
    root->left->left->right = new Node(9);

    root->left->right->left = new Node(10);
    root->left->right->right = new Node(11);

    return root;
}
int main(int argc, char const *argv[])
{
    Node *root = baseRoot();

    // zigZagTraversal(root);
    vector<vector<int>> tvrs = verticalTraversal(root);

    cout << "[";
    for (int i = 0; i < tvrs.size(); i++)
    {
        cout << "[";
        for (int j = 0; j < tvrs[i].size(); j++)
        {
            cout << tvrs[i][j] << " ";
        }
        cout << "]";
    }

    cout << "]";

    return 0;
}
