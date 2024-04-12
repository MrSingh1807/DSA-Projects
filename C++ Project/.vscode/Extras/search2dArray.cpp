#include <iostream>
using namespace std;

int index(int row, int column, int rowLength)
{
    return row * rowLength + column;
};

vector<int> indexPos(int index, int rowLength)
{
    int row = index / rowLength;
    int column = index % rowLength;

    vector<int> value = {0, 0};
    value[0] = row;
    value[1] = column;
    return value;
};

bool searchMatrix(vector<vector<int>> &matrix, int target)
{
    int str = 0, end = matrix.size() * matrix[0].size() - 1;
    int mid = str + (end - str) / 2;

    while (str <= end)
    {
        vector<int> pos = indexPos(mid, matrix.size());
        if (target == matrix[pos[0]][pos[1]])
            return true;
        else if (target > matrix[pos[0]][pos[1]])
            str = mid + 1;
        else
            end = mid - 1;

        mid = str + (end - str) / 2;
    }
}

int main(int argc, char const *argv[])
{
    // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

    vector<vector<int>> arr = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}};

    cout << searchMatrix(arr, 5);

        // cout << indexPos(6, 4)[0] << " " << indexPos(6, 4)[1];
        return 0;
}
