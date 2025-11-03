class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        int j=0;
        for(int i=0;i<n;i++)
        {
        hash.put(nums[i],j);
        j++;
        }
        if(hash.containsKey(target))
          return hash.get(target);
        else
          return -1;

        
    }
}