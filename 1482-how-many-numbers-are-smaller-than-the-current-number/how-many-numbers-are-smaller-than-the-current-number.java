class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n=nums.length;
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int a[]=new int[n];
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        if(!hash.containsKey(arr[i]))
           hash.put(arr[i],i);
        for(int i=0;i<n;i++)
        {
            int num=hash.get(nums[i]);
            a[i]=num;

        }
        return a;
    }
}