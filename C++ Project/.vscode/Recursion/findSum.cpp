#include <iostream>
using namespace std;

int sum(int demoArray [], int size)
{
   // base case
   if (size <= 0) return 0;
   
   //recursive relation
   int ans = demoArray[0] + sum(demoArray + 1, size -1); 
   return ans;
}

int main(int argc, char const *argv[])
{
    int arr[] = {2, 3, 4, 5, 7, 8};

    cout << endl << endl;

    cout << sum(arr, 6);
    cout << endl << endl;


    return 0;
}
