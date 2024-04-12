#include <iostream>
using namespace std;

int pivotIndex(vector<int> &nums)
{
    int start = 0 , end = nums.size()- 1; 
    int mid = start + (end - start)/ 2;

    int ans = -1;

    int wholeSum = 0;
    for (int i = 0; i < nums.size(); i++) wholeSum += nums[i];
    

}

int main()
{
}