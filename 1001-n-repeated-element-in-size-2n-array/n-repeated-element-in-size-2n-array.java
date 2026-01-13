class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            if(hash.get(nums[i])>1)
              return nums[i];
        }
        return 0;
    }
}