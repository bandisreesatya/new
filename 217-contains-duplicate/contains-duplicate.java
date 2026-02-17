class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        //  int a=nums.length;
        // for(int i=0;i<a-1;i++)
        // {
        //     if(nums[i]==nums[i+1])
        //     {
        //          return true;
        //     }
        // }
        // return false;
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            if(hash.get(nums[i])>=2)
               return true;
        }
        return false;
    }
}