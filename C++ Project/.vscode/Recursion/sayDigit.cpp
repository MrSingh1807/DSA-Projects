#include <iostream>
#include <string>

using namespace std;

void sayDigit(int number, string arr[])
{
    // base Case
    if (number <= 0)
        return;

    int digit = number % 10;

    sayDigit(number / 10, arr);

    cout << arr[digit] << endl;

}

int main(int argc, char const *argv[])
{
    string arr[] = {"Zero", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine"};

    // cout << arr[4];
    cout << endl
         << endl;
    sayDigit(234, arr);
    cout << endl << endl;

    return 0;
}
