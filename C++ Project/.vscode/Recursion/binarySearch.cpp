#include <iostream>
#include <string>

using namespace std;

bool binarySearch(int arr[], int start, int end, int key)
{
    // base case
    if (start > end)
        return false;

    int mid = start + (end - start) / 2;

 // Recursive Relation
    if (arr[mid] < key)
        return binarySearch(arr, mid + 1, end, key);
    else if (arr[mid] > key)
        return binarySearch(arr, start, mid - 1, key);
    else
        return true;
}

int main(int argc, char const *argv[])
{

    int arr[] = {2, 4, 5, 6, 8, 10, 12, 14, 17};

    cout << binarySearch(arr, 0, 9, 11);
    return 0;
}
