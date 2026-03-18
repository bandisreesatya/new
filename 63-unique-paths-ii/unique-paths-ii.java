class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        obstacleGrid[0][0]=obstacleGrid[0][0]==0?1:0;
        for(int i=1;i<c;i++){
            if(obstacleGrid[0][i]==1){
                obstacleGrid[0][i]=0;
            }
            else{
                obstacleGrid[0][i]=obstacleGrid[0][i-1];
            }
        }
        for(int j=1;j<r;j++){
            if(obstacleGrid[j][0]==1){
                obstacleGrid[j][0]=0;
            }
            else{
                obstacleGrid[j][0]=obstacleGrid[j-1][0];
            }
        }
       
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
               if(obstacleGrid[i][j]==1){
                obstacleGrid[i][j]=0;
               }
               else{
                obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
               }
            }
        }
        return obstacleGrid[r-1][c-1];

    }
}