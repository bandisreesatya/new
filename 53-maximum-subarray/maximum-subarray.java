class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0,maxsum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            cs+=nums[i];
            maxsum=Math.max(cs,maxsum);
            if(cs<0)
               cs=0;
        }
        return maxsum;
    }
}