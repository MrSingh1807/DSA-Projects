#include <iostream>
#include <vector>
using namespace std;

vector<int> reverse (vector<int> v) {

    int start = 0, end = v.size()-1;

    while (start <= end)
    {
       swapped(v, start, end);
       start++;
       end--;
    }
    
    return v;
}

void print (vector<int> v){

    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i];
        cout <<" ";
    }
    
}

void swapped( vector<int> v, int start, int end){
int value = v[start];
v[start] = v[end];
v[end] = value;
}
int main(int argc, char const *argv[])
{
    vector<int> i;
    i.push_back(11);
    i.push_back(7);
    i.push_back(3);
    i.push_back(12);
    i.push_back(4);


vector<int> result = reverse(i);
    print(result);

    return 0;
}
