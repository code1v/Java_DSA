public class GridMinPathSum{
    static int minPath(int[][] grid,int i,int j){
        int m =grid.length;
        int n =grid[0].length;
        if (i == m - 1 && j == n - 1) return grid[i][j];

        if(i >= m || j >= n) return Integer.MAX_VALUE;

        
        
        return grid[i][j]+Math.min(minPath(grid, i, j+1),minPath(grid, i+1, j));
    }
    public static void main(String args[]){
        int[][] grid ={
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        System.out.print(minPath(grid, 0, 0));
    }
}