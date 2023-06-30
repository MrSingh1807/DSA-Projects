#include <iostream>

using namespace std;

// bool isPrime(int n){
        
//         for (int i = 2; i < n; i++)
//         {
//            if ( n % i == 0)
//         {
//             return 0;
//         }
//         }
        
//     return 1;
// };
int isCountPrime (int n){
    if(n <= 1){
        return 0;
    }
    int count = 0;
    vector<bool> prime(n+1, true);
    
    for (int i = 2; i < n; i++)
    {
        if ( prime[i])
        {
            count++;
        }

        for (int j = i*2; i < count; j=j+i)
        {
            prime[j]= 0;
        }
        
    }
    return count;
};

int main(int argc, char const *argv[])
{
    
    int x;
    cout << "Enter the value: ";
    cin >> x;
    cout <<isCountPrime(x);

    return 0;
};
