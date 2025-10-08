class Solution {
public boolean isok(int piles[],int mid,int h)
{
    int sum=0;
    for(int i=0;i<piles.length;i++)
    {
        sum+=Math.ceil((double)piles[i]/mid);
    }
    if(sum<=h)
      return true;
    else
      return false;
}
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=0;
        int max=piles[0];
        for(int i=0;i<n;i++)
        {
            if(piles[i]>max)
               max=piles[i];
        }
        int r=max;
        int ans=0;
        while(l<=r)
        {
            int mid=(r+l)/2;
            //System.out.println(l+" "+r+" "+mid);
            if(isok(piles,(int)mid,h))
             {
                ans=mid;
                r=mid-1;
             }
             else
               l=mid+1;
         
        }
        return ans;
        
        
    }
}