class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int l=nums.length;
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==1)
            c++;
            max=Math.max(max,c);
            if(nums[i]==0)
                c=0;

        }
        return max;
        
    }
}
