class Solution {
    public int search(int[] nums, int target) {
        
        int l=nums.length;
        int low=0;
        int high=l-1;
        int ans=-1;
        while(low<=high)
        {
           int mid=(low+high)/2;
           if(nums[mid]==target)
               return mid;
            else if(nums[mid]>target)
                 high=mid-1;
            else
             low=mid+1;
        }
        return -1;
    }
}