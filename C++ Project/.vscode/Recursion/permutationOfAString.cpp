#include <iostream>
#include <vector>
using namespace std;

// coading ninjas - in String
// permutation in int array - leetCode => 46

void permutation(vector<int> nums, vector<vector<int>> &ans, int index)
{
    // base case
    if (index >= nums.size())
    {
        ans.push_back(nums);
        return;
    }

    for (int i = 0; i < nums.size(); i++)
    {
        swap(nums[index], nums[i]);
        permutation(nums, ans, index + 1);
        swap(nums[index], nums[i]);
    }
}
