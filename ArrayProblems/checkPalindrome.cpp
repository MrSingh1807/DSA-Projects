#include <iostream>
#include <string>
#include<vector>

using namespace std;

string toLowerCase(string input){
    int start = 0;
    int end = input.length()-1;
    string inputInLowerCase = "";

    while (start <=  end)
    {
        if ((input[start] >= 'a' && input[start] <= 'z') || (input[start] >= '0' && input[start] <= '9') )
        { 
           inputInLowerCase.push_back(input[start]) ;
        } else if ((input[start] >= 'A' && input[start] <= 'Z'))
        {
            inputInLowerCase.push_back(input[start] - 'A' + 'a') ;
        } else {
            start++;
        }
    }
    return inputInLowerCase;
}

bool valid(char ch) {
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return 1;
        }
        return 0;
    }

bool checkPalindrome(string str)
{
    string result = toLowerCase(str);
    int start = 0;
    int end = result.size() -1;

    while (start < end)
    {   
        if (result[start] == result[end])
        {
            start++; 
            end-- ;
        } else { 
            return 0;
            }
    }

    return 1;
}

int main(int argc, char const *argv[])
{
    string n = "nNGrdcRWoy FIYM19I2";
    cout << toLowerCase(n);
    return 0;
}
