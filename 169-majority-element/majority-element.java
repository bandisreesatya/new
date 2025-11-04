class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hash =new HashMap<>();
         for(int i=0;i<n;i++)
           hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        int max=0,k=0;
        for(int i=0;i<n;i++)
       {
        max=Math.max(max,hash.get(nums[i]));
        if(max==hash.get(nums[i]))
           k=nums[i];
       }
             
        return k;
    }
}