
public class GridObstacles {
    static int countways(int[][] grid,int i,int j){
        int m =grid.length;
        int n =grid[0].length;
        
        if(i >= m || j >= n) return 0;
        if(grid[i][j] == 1) return 0;
        if(i == m-1 && j == n-1) return 1;
        return countways(grid,i, j+1) + countways(grid,i+1, j);
    }
    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,1,0},{0,0,0}};
        System.out.print(countways(grid,0,0));
    }
}
