#include <iostream>
using namespace std;

bool isPalindrome(string str, int i)
{

    // base case
    if (i > str.length() / 2)
        return true;

    // Recursive Relation
    if (str[i] != str[str.length() - i - 1])
        return false;
    else
        return isPalindrome(str, i + 1);
}

int main(int argc, char const *argv[])
{


string demoStr = "pqrstsrqp";
cout << endl << endl;

cout << isPalindrome(demoStr, 0);
cout << endl << endl;
    return 0;
}
