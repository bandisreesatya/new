class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int i=0,cz=0,max=0;
        for(int j=0;j<nums.length;j++)
        {
            int num=nums[j];
            if(num==0) 
               cz++;
            while(cz>k)
            {
                if(nums[i]==0)
                   cz--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}