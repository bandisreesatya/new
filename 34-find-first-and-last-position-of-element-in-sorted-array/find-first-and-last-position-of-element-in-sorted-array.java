class Solution {
    public int foccur(int[] nums,int target)
    {
    int n=nums.length;
    int l=0;
    int r=n-1;
    int ans=-1;
    while(l<=r)
    {
        int mid=l+(r-l)/2;
        if(nums[mid]==target)
          {
            ans=mid;
            r=mid-1;
          }
          else if(nums[mid]>target)
            r=mid-1;
        else
           l=mid+1;
          
    }
    return ans;
    }
    public int loccur(int[] nums,int target)
    {
    int n=nums.length;
    int l=0;
    int r=n-1;
    int ans=-1;
    while(l<=r)
    {
        int mid=l+(r-l)/2;
        if(nums[mid]==target)
          {
            ans=mid;
            l=mid+1;
          }
          else if(nums[mid]>target)
            r=mid-1;
        else
           l=mid+1;
          
    }
    return ans;
    }

    public int[] searchRange(int[] nums, int target) {
       int[] arr=new int[2];
       arr[0]=foccur(nums,target);
       arr[1]=loccur(nums,target);
       return arr;
}
}