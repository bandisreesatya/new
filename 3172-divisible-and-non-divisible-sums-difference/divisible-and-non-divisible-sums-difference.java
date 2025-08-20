class Solution {
    public int differenceOfSums(int n, int m) {
        int d=n/m;
        int sum=0;
        for(int i=1;i<=d;i++)
        {
            // System.out.println(m+" "+d);
            sum=sum+(m*i);
        }
        // System.out.println(sum);
        int nm=(n*(n+1))/2;
        int sum1=nm-sum;
        return sum1-sum;
        
    }
}