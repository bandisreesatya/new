class Solution {
    public int minBitFlips(int start, int goal)
    {
        int c=0;
       for(int i=0;i<30;i++)
       {
        int p1=((start&(1<<i))==0)?0:1;
        int p2=((goal&(1<<i))==0)?0:1;
        if(p1!=p2)
          c++;
       }
       return c;
    }
}