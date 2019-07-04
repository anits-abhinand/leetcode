class Solution {
    public int islandPerimeter(int[][] grid) {
        
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int perimeter = 0;
        for(int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter = perimeter + 4 + getPeriContribution(grid, i, j+1) +
                        getPeriContribution(grid, i+1, j) + getPeriContribution(grid, i-1, j) 
                        + getPeriContribution(grid, i, j-1);
                }
            }
        }
        return perimeter;
    }
    
    private int getPeriContribution(int[][] grid, int x, int y) {
        if (x < grid.length && x >= 0) {
            if (y < grid[0].length && y>= 0) {
                if (grid[x][y] == 1) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
