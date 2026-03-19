class Solution {
    static int[][] arr=new int[34][34];
    static{
        arr[0][0]=1;
        for(int i=0;i<34;i++){
            arr[i][i]=1;
            arr[i][0]=1;
        }
        for(int i=1;i<34;i++){
            for(int j=1;j<=i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            list.add(arr[rowIndex][i]);
        }
        return list;
    }
}