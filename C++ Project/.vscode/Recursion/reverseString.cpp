#include <iostream>
using namespace std;

void reversedString(int i, string &str)
{
    // base case
    int n = str.length();
    if (i > n / 2)
        return;

    char temp = str[i];
    str[i] = str[n - 1 - i];
    str[n - 1 - i] = temp;
    i++;

    reversedString(i, str);
}

int main(int argc, char const *argv[])
{
    /* code */

string name  = "assads";
reversedString(0, name);

cout << name;

    return 0;
}
