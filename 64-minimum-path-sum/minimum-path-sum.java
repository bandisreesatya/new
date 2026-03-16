class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        // for(int i=1;i<c;i++){
        //     grid[0][i]+=grid[0][i-1];
        // }
        // for(int j=1;j<r;j++){
        //     grid[j][0]+=grid[j-1][0];
        // }
        // for(int i=1;i<r;i++){
        //     for(int j=1;j<c;j++){
        //         grid[i][j]=grid[i][j]+ Math.min(grid[i-1][j],grid[i][j-1]);
        //     }
        // }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0&&j==0) continue;
                if(i==0){
                    grid[i][j]+=grid[i][j-1];
                }
                else if(j==0){
                    grid[i][j]+=grid[i-1][j];
                }
                else{
                    grid[i][j]=grid[i][j]+Math.min(grid[i-1][j],grid[i][j-1]);
                }

            }
        }
        return grid[r-1][c-1];   
    }
}