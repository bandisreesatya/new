class Solution {
    static int[][] arr=new int[31][31];
    static
    {
        for(int i=0;i<31;i++)
        {
            arr[i][i]=1;
            arr[i][0]=1;
        }
        for(int i=1;i<31;i++)
        {
            for(int j=1;j<=i;j++)
            {
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
    }
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<=i;j++)
            list.add(arr[i][j]);
         ans.add(list);
        }
        return ans;
    }
}