class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                nums[c]=nums[i];
                c++;
            }
        }
       for(int j=c;j<l;j++)
          nums[j]=0;
        
    }
}