#include <iostream>
using namespace std;

bool isMinimum(int n, int m, vector<int> time, int mid)
{
    int oneDay = 100 * 100;
    int daysRequired = 0;
    int totalTime = 0;

    for (int i = 0; i < m; i++)
    {
        totalTime += time[i];

        if (totalTime > mid)
        {
            daysRequired++;
            totalTime = time[i];
        }
    }
    daysRequired++; // For the last day

    return daysRequired <= n;
}

long long ayushGivesNinjatest(int n, int m, vector<int> time)
{
    int sum = 0;

    for (int i = 0; i < time.size(); i++)
        sum += time[i];

    int start = 0, end = sum;
    long long ans = -1;
    int mid = start + (end - start) / 2;

    while (start <= end)
        if (isMinimum(n, m, time, mid))
        {
            ans = mid;
            end = mid - 1;
        }
        else
            start = mid + 1;

    return ans;
}

int main()
{
}