#include <iostream>
#include <vector>
using namespace std;

bool isSafe(vector<vector<int> > &m, int n, int sorceX, int sorceY, vector<vector<bool> > &visited)
{
    if (sorceX >= 0 && sorceY >= 0 && sorceX < n && sorceY < n && m[sorceX][sorceY] == 1 && !visited[sorceX][sorceY])
    {
        return true;
    }

    return false;
}

void solve(vector<vector<int> > &m, int n, vector<string> &ans, int sorceX, int sorceY,
           vector<vector<bool> > &visited, string path)
{
    // base case
    if (sorceX == n - 1 && sorceY == n - 1)
    {
        ans.push_back(path);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                visited[i][j] = 0;   
        
        return;
    }

    visited[sorceX][sorceY] = true;

    // move the rat -> Down (x + 1, y)
    if (isSafe(m, n, sorceX + 1, sorceY, visited))
    {
        path.push_back('D');
        solve(m, n, ans, sorceX + 1, sorceY, visited, path);
        path.pop_back();
    }

    // move the rat -> Left (x, y - 1)
    if (isSafe(m, n, sorceX, sorceY - 1, visited))
    {
        path.push_back('L');
        solve(m, n, ans, sorceX, sorceY - 1, visited, path);
        path.pop_back();
    }

    // move the rat -> Right (x , y + 1)
    if (isSafe(m, n, sorceX, sorceY + 1, visited))
    {
        path.push_back('R');
        solve(m, n, ans, sorceX, sorceY + 1, visited, path);
        path.pop_back();
    }

    // move the rat -> Up  (x - 1, y )
    if (isSafe(m, n, sorceX - 1, sorceY, visited))
    {
        path.push_back('U');
        solve(m, n, ans, sorceX - 1, sorceY, visited, path);
        path.pop_back();
    }

    visited[sorceX][sorceY] = 0;
}

vector<string> findPath(vector<vector<int> > &m, int n)
{
    vector<string> answer;

    // check if start index is 0
    if (m[0][0] == 0)
        return answer;

    int sorceX = 0, sorceY = 0;

    // visiting array
    vector<vector<bool> > visited (4, vector<bool>(4, 0));

    vector<string> ans;
    string path = "";

    solve(m, n, ans, sorceX, sorceY, visited, path);
    sort(ans.begin(), ans.end());

    return ans;
}

int main(int argc, char const *argv[])
{

    vector<vector<int> > m;

        
    m.push_back({1, 0, 0, 0});
    m.push_back({1, 1, 0, 1});
    m.push_back({1, 1, 0, 0});
    m.push_back({0, 1, 1, 1});

     
    vector<string> result = findPath(m, 4);


    // vector<vector<int> > m (4, vector<int>(4, 0));

    for (int i = 0; i < 4; i++)
    {
        cout << result[i] ;
    }

    return 0;
}
