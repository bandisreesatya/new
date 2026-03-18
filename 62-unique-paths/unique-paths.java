class Solution {
    static int[][] arr=new int[101][101];
    static{
        for(int i=0;i<101;i++){
            arr[i][0]=1;
            arr[0][i]=1;
        }
        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
    }
    public int uniquePaths(int m, int n) {
        return arr[m-1][n-1];
    }
}