class Solution {
    public int missingNumber(int[] nums) {
        
    int k=nums.length,t=0;
    int sum=0,temp;
    for(int i=0;i<k;i++)
    {
       sum+=nums[i];
        
    }
    t=(k * (k+1))/2;
    temp=t-sum;
    return temp;
}
}