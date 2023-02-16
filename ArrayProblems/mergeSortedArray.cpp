#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char const *argv[])
{
    vector<int> arr1 = {1,3,5,7,9};

    vector<int> arr2 = {2,4,6,8};
    
    for (int x : arr2) {
        cout << x << " ";
    }


    return 0;
}

vector<int> merge(vector<int>& nums1, int m, vector<int>& nums2, int n){

    int i = 0, j = 0;

    vector<int> array = vector<int>(); 
    int arrayIndex = 0;


    while (i < m && j < n){

        // if (num1[i] == num2[j]){
        //     array[arrayIndex++] = num1[i++];
        // }

        if (nums1[i] < nums2[j]){
            array[arrayIndex++] = nums1[i++];

        } else // if ( num1[i] > num2[j])
        {
            array[arrayIndex++] = nums2[j++];

        }
    }

    while (i < m){
        array[arrayIndex++] = nums1[i++];

    }
    while (j < n ){
        array[arrayIndex++] = nums2[j++];
    }

if (array.size() > nums1.size()) {
        nums1.resize(array.size());
    }
    
    nums1 = array;
}

void print (vector<int> nums)
{
    for (int i : nums)
    {
        cout << i << " ";
    }
}