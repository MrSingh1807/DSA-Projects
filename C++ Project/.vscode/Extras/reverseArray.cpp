#include <iostream>
#include <vector>
using namespace std;

void printArray(vector<int> &arr)
{
    for (int i = 0; i < arr.size(); i++)
        cout << " ", cout << arr[i];
}

void reverseArray(vector<int> &arr, int m)
{

 vector<int> finalArray = IntArray(m + n)
    int i = 0, j =  0;
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) finalArray[i + j] = nums1[i++]
        else finalArray[i + j] = nums2[j++]
    }

    while (j < n) finalArray[i + j] = nums2[j++]
    while (i < m) finalArray[i + j] = nums1[i++]

   
    printArray(arr);
};

int main(int argc, char const *argv[])
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    vector<int> vect(arr, arr + n);

    reverseArray(vect, 3);
    return 0;
}
