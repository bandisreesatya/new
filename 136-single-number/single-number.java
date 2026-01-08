class Solution {
    public int singleNumber(int[] nums) {
    //    int result=0;
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     result^=nums[i];
    //    }
    //    return result;
       HashMap<Integer,Integer> hash=new HashMap<>();
       for(int i=0;i<nums.length;i++)
          hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        for(int i=0;i<nums.length;i++)
        {
            if(hash.get(nums[i])==1)
              return nums[i];
        }
        return 0;
       

    }
}