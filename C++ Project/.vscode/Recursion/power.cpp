#include <iostream>
using namespace std;
  

int power(int a, int b){
    // base case 
    if (b == 0) return 1;
    if ( b == 1 ) return a;
    

    //Recursive relation
    int ans = power(a, b/2);

    if (b%2 == 0)
    {
     return ans * ans;
    } else {
        return a * ans *ans; 
    }

}


  int main(int argc, char const *argv[])
  {
    int pow = power(3, 3);
    

    cout << pow;
    return 0;
  }
  