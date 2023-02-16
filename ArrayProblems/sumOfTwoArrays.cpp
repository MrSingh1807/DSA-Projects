#include <iostream>
#include <vector>

using namespace std;




vector<int> reverse(vector<int> v) {    
    int s = 0;
    int e = v.size()-1;
    
    while(s<e)
    {
        swap(v[s++], v[e--]);
    }
    return v;
}

void print (vector<int> nums)
{
    for (int i : nums)
    {
        cout << i << " ";
    }
}

vector<int> findArraySum(vector<int>&a, int n, vector<int>&b, int m) {
	
    int i = n -1;
    int j = m -1;
    

    int carry = 0;
    vector<int> answer; 
    
     while (i >= 0 && j >= 0)
    {
        int valueA = a[i];
        int valueB = b[j];

        int sum = valueA + valueB + carry;
        carry = sum / 10; 
        sum = sum % 10;
        answer.push_back(sum);
        i-- ;
        j--;

   }

    // Case 1 -> first array is long 
    while (i >= 0)
    {
        int sum = a[i] + carry;
        carry = sum / 10;
        sum = sum % 10;
        answer.push_back(sum);
        i--;
    }
    

    // Case 2 -> second array is long 
    while (j >= 0)
    {
        int sum = b[j] + carry;
        carry = sum / 10;
        sum = sum % 10;
        answer.push_back(sum);
        j--;
    }


    // Case 3 -> Both array has same size but ans is long 
    while ( carry != 0)
    {
        int sum = carry;
        carry = sum / 10;
        sum = sum % 10;
        answer.push_back(sum);
    }
    

    return  reverse(answer);
}

int main(int argc, char const *argv[])
{
    vector<int> a = vector<int>();
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);
    a.push_back(4);
    
    vector<int> b = vector<int>();
    b.push_back(6);

    print(findArraySum(a, a.size(), b, b.size()));
    
    return 0;
}