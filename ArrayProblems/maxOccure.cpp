#include <iostream>

using namespace std;

char getMaxOccuringChar(string str)
    {
       int arr[26] = {0};

       for (int i = 0; i < str.length(); i++)
       {
        int number = 0;
        if (str[i] >= 'a' && str[i] <= 'z'){
            number = str[i] - 'a';

        } else if (str[i] >= 'A' && str[i] <= 'Z')
        {
            number = str[i] - 'A';
        } 
        arr[number]++;
        
       }

       int maxi = - 1, ans = 0;
       for (int i = 0; i < 26 ; i++)
       {
        if (maxi < arr[i])
        {
            ans = i;
           maxi = arr[i];
        }
        
       }
       
       return 'a' + ans;
    }

int main(int argc, char const *argv[])
    {
        string s;
        cin >> s;

        cout << getMaxOccuringChar(s); 

        return 0;
    }
    

