#include <iostream>
#include <vector>

using namespace std;

void reverseString(vector<char>& s) {
        int start = 0;
        int end = s.size() -1;

        while (start < end)
        {
            swap(s[start], s[end]);
        }
        
    }

int main(int argc, char const *argv[])
{
    vector<char>& s = {"h","e","l","l","o"};
    
    return 0;
}


