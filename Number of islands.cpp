class Solution {
  public:
    // Function to find the number of islands.
    void dfs(vector<vector<char>>& grid, int n, int m, int i, int j) {
    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') return;
    
    // Mark the current cell as visited by setting it to '0'
    grid[i][j] = '0';

    // Recursively visit all 8 neighboring cells
    dfs(grid, n, m, i - 1, j - 1);  // Top-left
    dfs(grid, n, m, i - 1, j);      // Top
    dfs(grid, n, m, i - 1, j + 1);  // Top-right
    dfs(grid, n, m, i, j - 1);      // Left
    dfs(grid, n, m, i, j + 1);      // Right
    dfs(grid, n, m, i + 1, j - 1);  // Bottom-left
    dfs(grid, n, m, i + 1, j);      // Bottom
    dfs(grid, n, m, i + 1, j + 1);  // Bottom-right
}

// Function to count the number of islands
int numIslands(vector<vector<char>>& grid) {
    int n = grid.size();
    int m = grid[0].size();
    int count = 0;

    // Traverse through each cell of the grid
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            // If a land cell ('1') is found, start DFS
            if (grid[i][j] == '1') {
                dfs(grid, n, m, i, j);
                count++;  // Increment the count of islands
            }
        }
    }
    return count;
}
};
