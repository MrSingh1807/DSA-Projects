#include <iostream>
using namespace std;



bool isSorted(int arr [],int size ) {

//base case
if (size == 0 || size == 1) return true; 

// Recursive Relation 
if (arr[0] > arr[1]) return false;
else  return isSorted (arr + 1, size - 1 );
}


int main(int argc, char const *argv[])
{
    
    
    return 0;
}
