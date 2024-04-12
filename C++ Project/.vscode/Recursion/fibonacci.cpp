#include <iostream>
using namespace std;

int fib(int n)
{
    // base case
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    // Recursive Relation
    return fib(n - 1) + fib(n - 2);
}

int main(int argc, char const *argv[])
{

    cout << fib(6);
    return 0;
}
