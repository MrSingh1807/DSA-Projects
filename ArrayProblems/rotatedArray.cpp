#include <iostream>
#include <vector>

using namespace std;


void rotate(vector<int>& nums, int k) {
        vector<int> temp(nums.size());

        for (int i = 0; i < nums.size(); i++)
        {
            temp[(i+k) % nums.size()] = nums[i];
        }

        nums = temp;
        
    }

void print (vector<int> nums)
{
    for (int i : nums)
    {
        cout << i << " ";
    }
}

int main(int argc, char const *argv[])
{

vector<int> nums = {1,2,3,4,5,6,7};
rotate(nums, 3);



    return 0;
}


