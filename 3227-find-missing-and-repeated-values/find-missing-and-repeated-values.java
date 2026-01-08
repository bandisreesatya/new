class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n=grid.length;
        int arr[]=new int[2];
        HashMap<Integer,Integer> hash=new HashMap<>();
        int sum=0;

        int total=((n*n)*((n*n)+1)/2);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                hash.put(grid[i][j],hash.getOrDefault(grid[i][j],0)+1);
                if(hash.get(grid[i][j])>1)
                {
                    arr[0]=grid[i][j];
                  continue;
                }
                sum+=grid[i][j];
            }
        }
        sum=Math.abs(sum-total);
        arr[1]=sum;
        return arr;

    }
}