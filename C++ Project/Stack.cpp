#include <iostream>
#include <vector>
using namespace std;

class Stack
{
private:
    vector<int> data;

public:
    void push(int value)
    {
        data.push_back(value);
    }

    int add(int a, int b)
    {
        return a + b;
    }
};

int main(int argc, char const *argv[])
{
    
    
    return 0;
}
