#include<string>
#include<iostream>
#include<vector>
using namespace std;


string removeSpecialCharacter(string s){
    string result = "";

    for (int i = 0; i < s.length() ; i++)
    {
        if ((s[i] >= 'a' &&  s[i] <='z') || (s[i] >= '0' &&  s[i] <='9')){
            result += s[i];
    } else if (s[i] >= 'A' && s[i] <= 'Z')
    {
        result += s[i] - 'A' + 'a';
    }
    }
    return result;
}

bool isPalindrome(string s){

}

int main(int argc, char const *argv[])
{
    /* code */
    return 0;
}
