class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
         int a=nums.length;
        for(int i=0;i<a-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                 return true;
            }
        }
        return false;
        
    }
}