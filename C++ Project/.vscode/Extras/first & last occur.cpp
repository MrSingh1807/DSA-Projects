#include <iostream>
using namespace std;

int firstOccur(vector<int> &arr, int key)
{
    int start = 0, end = arr.size() - 1;
    int mid = start + (end - start) / 2;

    int ans = -1;
    while (start <= end)
    {
        if (arr[mid] == key)
        {
            ans = mid;
            end = mid - 1;
        }
        else if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else if (arr[mid] > key)
        {
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }
    return ans;
};
int lastOccur(vector<int> &arr, int key)
{
    int start = 0, end = arr.size() - 1;
    int mid = start + (end - start) / 2;

    int ans = -1;
    while (start <= end)
    {
        if (arr[mid] == key)
        {
            ans = mid;
            start = mid + 1;
        }
        else if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else if (arr[mid] > key)
        {
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }
    return ans;
};

int main()
{
    vector<int> numbers;

    numbers.push_back(10);
    numbers.push_back(10);
    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(20);
    numbers.push_back(20);
    numbers.push_back(20);
    numbers.push_back(30);

    cout << firstOccur(numbers, 20) << endl;
    cout << lastOccur(numbers, 20);
}

// pair<int, int> firstAndLastPosition(vector<int> &arr, int n, int k)
// {
//     // Write your code here
//     int start = 0, end = n - 1;
//     int mid = start + (end - start) / 2;
// }
