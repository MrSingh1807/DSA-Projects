#include <iostream>
using namespace std;

int peakIndexInMountainArray(vector<int> &arr)
{
    int start = 0, end = arr.size() - 1;
    int mid = start + (end - start) / 2;

    while (start < end)
    {
        if (arr[mid] < arr[mid + 1])
        {
            start = mid + 1;
        } else if (arr[mid] > arr[mid + 1])
        {
            end = mid;
        } 
        mid = start + (end - start) / 2;
    }
    
    return start;
}

int main()
{

     vector<int> numbers;

    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);
    numbers.push_back(40);
    numbers.push_back(50);
    numbers.push_back(30);
    numbers.push_back(20);
    numbers.push_back(10);

    int value  = 450;
    cout << value % 100;

    // cout << peakIndexInMountainArray(numbers);
}
