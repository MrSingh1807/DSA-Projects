#include <iostream>
#include <string>

using namespace std;

string removeDuplicates(string s) {
        
        int i = 0;
        while (i < s.length()){
            if (s[i] == s[i+1])
            {
                s.erase(i, 2);
                i = 0;
            } else {
                i++;
            }
        }
        return s;
    }
int main(int argc, char const *argv[])
{
    string s = "abbaca";
     cout << removeDuplicates(s);

    return 0;
}
