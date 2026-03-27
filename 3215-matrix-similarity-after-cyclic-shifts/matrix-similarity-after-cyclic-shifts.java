class Solution {
    public boolean areSimilar(int[][] mat, int k){
        int r=mat.length;
        int c=mat[0].length;
        int[][] arr=new int[r][c];
        k=k%c;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int val;
                if((i&1)==0){
                    val=mat[i][(j+k)%c];
                }
                else{
                    val=mat[i][(j-k+c)%c];
                }
                if(val!=mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}