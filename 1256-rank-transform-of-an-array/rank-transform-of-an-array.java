class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] nums=arr.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> hash=new HashMap<>();
        int j=1;
        for(int i=0;i<n;i++)
           {
            if(!hash.containsKey(nums[i]))
            {
                hash.put(nums[i],j);
                j++;
            }
           }
           int[] a=new int[n];
           for(int i=0;i<n;i++)
           {
            int r=hash.get(arr[i]);
            a[i]=r;
           }
           return a;
    }
}