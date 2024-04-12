#include <iostream>
using namespace std;

int countPrimes(int n)
{
    int result = 0;
    vector<bool> primes(n + 1, true);
    primes[0] = primes[1] = false;

    for (int i = 2; i < n; i++)
    {
        if (primes[i])
        {
            result++;

            for (int j = 2 * i; j < n; j += i)
                primes[j] = 0;
        }
    }

    return result;
}

int gcd(int n, int m)
{

    while (m != 0)
    {
        int temp = m;
        m = n % m;
        n = temp;
    }

    return n;
}

int modularExponentiation(int x, int n, int m)
{
    long result = 1;
    int reminder = 0;

    for (int i = 0; i < n; i++)
    {
        result *= x;

        if (result > n)
        {
            reminder += result % m;
            result = 1;
        }

        if (reminder > n)
            reminder %= m;
    }

    return reminder;
}
int main(int argc, char const *argv[])
{

    cout << modularExponentiation(5, 2, 10);
    // cout << (10000000 * 10000000) % 10000001;

    return 0;
}
