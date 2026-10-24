import java.util.Queue;
import java.util.LinkedList;
public class LC200 {
    public static void main(String[] args) {
        
    }
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1' && visit[i][j] == false){
                    dfs(i,j,grid,visit);
                    // bfs(i,j,grid,visit);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, char[][] grid, boolean[][] visit){
        int m = grid.length, n = grid[0].length;
        visit[i][j] = true;
        if(i-1>=0 && grid[i-1][j] == '1' && !visit[i-1][j])dfs(i-1,j,grid,visit);
        if(i+1<m && grid[i+1][j] == '1' && !visit[i+1][j]) dfs(i+1,j,grid,visit);
        if(j-1>=0 && grid[i][j-1] == '1' && !visit[i][j-1]) dfs(i,j-1,grid,visit);
        if(j+1<n && grid[i][j+1] == '1' && !visit[i][j+1]) dfs(i,j+1,grid,visit);
    }
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    // public void bfs(int i, int j, char[][] grid, boolean[][] visit){
    //     Queue<Pair> q = new LinkedList<>();
    //     q.add(new Pair(i,j));
    //     while(q.size()>0){
    //         Pair front = q.remove();
    //         int row = front.row;
    //         int col = front.col;
    //         //right -> row,col+1
    //         if(col+1<grid[0].length){
    //             if(visit[row][col+1] == false && grid[row][col+1] == '1') q.add(new Pair(row,col+1));
    //         }
    //         //down -> row+1,col
    //         if((row+1)<m){
    //             if(visit[row+1][col]==false && grid[row+1][col] == '1'){
    //                 q.add(new Pair(row+1,col));
    //                 visit[row+1][col]=true;
    //             }
    //         }
    //     }
    // }
}
