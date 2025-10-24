class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int j=0;j<n;j++)
          arr[j]=nums[j];
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
               c++;
            } 
        }
        if(c==1)
        {
            if(nums[0]>=nums[n-1])
                return true;
             else
             return false;
        }
        else  if(Arrays.equals(nums,arr))
                return true;
                else
                return false;
        

}
}