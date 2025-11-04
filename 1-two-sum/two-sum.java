class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        //int j=0;
            int[] a=new int[2];
        for(int i=0;i<n;i++)
        {
            int s=target-nums[i];
            if(hash.containsKey(s))
              {
                a[0]=hash.get(s);
                a[1]=i;
                break;
              }
              hash.put(nums[i],i);
            
        }
        return a;

        

    }
}