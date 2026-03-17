class Solution {
    static int[] arr=new int[46];
    static{
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<46;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
    public int climbStairs(int n) {
        return arr[n];
    }
}