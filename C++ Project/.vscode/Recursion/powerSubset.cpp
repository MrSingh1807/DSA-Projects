#include <iostream>
#include <vector>
using namespace std;

void powerSubset ( vector<int> nums, vector <int> output, int index, vector<vector<int>> &ans)
{
    // base case 
    if (index >=  nums.size())
    {
       ans.push_back(output);
       return;
    }
    
    // exclude 
    powerSubset(nums, output, index + 1, ans);

    // include
    int element =  nums[index];
    output.push_back(element);
    powerSubset(nums, output, index + 1, ans);

}

// LeetCode - 78

int main(int argc, char const *argv[])
{

    return 0;
}
