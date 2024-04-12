#include <iostream>
using namespace std;

int partition(int arr[], int start, int end)
{
    int pivot = arr[start];
    int count = 0;

    for (int i = start + 1; i <= end; i++)
        if (arr[i] <= pivot) count++;


    // place pivot at right position 
    int pivotIndex = start + count;
    swap(arr[pivotIndex], arr[start]);

    // manage left & right part 
    int i = 0, j = 0;

    while (i < pivotIndex && j > pivotIndex)
    {
        while (arr[i] < pivot) i++;
        while (arr[j] > pivot) j--;

        if (i < pivotIndex && j > pivotIndex) 
        {
            swap(arr[i++], arr[j--]);
        }
        
    }

    return pivotIndex;
    
}

void quickSort(int arr[], int start, int end)
{
    // base case
    if (start >= end)
        return;

    // Recursive Relation
    int p = partition(arr, start, end);

    // sort left part
    quickSort(arr, start, p - 1);

    // sort right part
    quickSort(arr, p + 1, end);
}

int main(int argc, char const *argv[])
{

    return 0;
}
