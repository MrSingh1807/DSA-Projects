#include <iostream>
using namespace std;

bool isPossible(vector<int> &stalls, int k, int mid)
{
    int cowCount = 1;
    int lastPosition = stalls[0];

    for (int i = 0; i < stalls.size(); i++)
    {
        if (stalls[i] - lastPosition >= mid)
        {
            cowCount++;
            if (cowCount > k)
                return true;
            lastPosition = stalls[i];
        }
    }
}

int aggressiveCows(vector<int> &stalls, int k)
{
    sort(stalls.begin(), stalls.end());
    int start = 0;
    int end = stalls[stalls.size() - 1];
    int mid = start + (end - start) / 2;
    int ans = -1;

    while (start < end)
    {
        if (isPossible(stalls, k, mid))
        {
            ans = mid;
            start = mid + 1;
        }
        else
            end = mid - 1;

        mid = start + (end - start) / 2;
    }
    return ans;
}

int main()
{

    int arr[] = {0, 3, 4, 7, 10, 9};
    int n = sizeof(arr) / sizeof(arr[0]);

    vector<int> vect(arr, arr + n);

    cout << aggressiveCows(vect, 5);
}
