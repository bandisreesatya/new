class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double max=Double.NEGATIVE_INFINITY;
        int i=0,j=0;
        int sum=0;
        int c=0;
        for(j=0;j<n;j++){
            sum+=nums[j];
            while(i<n&&j-i+1==k){
               max=Math.max(max,(double)sum/(k));
               sum-=nums[i];
               i++;
            }
        }
        return max;
    }
}
