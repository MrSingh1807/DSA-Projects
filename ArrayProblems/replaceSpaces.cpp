#include <iostream>

using namespace std; 


string replaceSpaces(string & str){

    for (int i = 0; i < str.size(); i++)
    {
        if (str[i] == ' ')
        {
            str.erase(i);
            str.insert(i, "@40");
        }
        
    }
    
    return str;
    
}
int main(int argc, char const *argv[])
{
    string exam = "Hello World!";
    cout<< replaceSpaces(exam);

    return 0;
}
