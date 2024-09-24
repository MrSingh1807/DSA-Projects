#include <iostream>
using namespace std;

class Stack{

public:
    int *arr;
    int top;
    int size;

    Stack(int size)
    {
        this->size = size;
        arr = new int[size];
        top = -1;
    }

public:
    int peek() { return arr[top]; }

    void push(int element)
    {
        if (size - top > 1)
            arr[++top] = element;
        else
            cout << "Stack Overflow" << endl;
    }

    int pop()
    {
        if (top >= 0)
            return arr[top--];
        else
            cout << "Stack is Empty" << endl;
        return -1;
    }

    bool isEmpty()
    {
        if (top == -1)
            return true ;
        else 
            return false;
    }
};

int main(int argc, char const *argv[])
{

    Stack demo(5);

    demo.push(5);
    demo.push(3);

    cout << endl << demo.peek() << endl << endl;

    return 0;
}
