#include <iostream>
#include <vector>
using namespace std;

// leetCode - 17th
// hint same as Subsequence

void letterCombination(string digit, string outPut, int index, vector<string> &ans, string mapping[])
{
    // base case
    if (index >= digit.length())
    {
        ans.push_back(outPut);
        return;
    }

    int number = digit[index] - '0';
    string value = mapping[number];

    for (int i = 0; i < value.size(); i++)
    {
        outPut.push_back(value[i]);
        letterCombination(digit, outPut, index + 1, ans, mapping);
        outPut.pop_back();
    }
};

int main(int argc, char const *argv[])
{
    string mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    vector<string> ans;

    cout << endl;

    // cout << letterCombination("23", "", 0, ans, mapping);

    cout << endl
         << endl;

    return 0;
}
