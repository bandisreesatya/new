class Solution {
    public int minFlips(String s)
    {
        int n=s.length();
        s=s+s;
        int a1=0,a2=0;
        int ans=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            char e1=(r%2==0)?'0':'1';
            char e2=(r%2==0)?'1':'0';
            if(s.charAt(r)!=e1) a1++;
            if(s.charAt(r)!=e2) a2++;
            if(r-l+1>n)
            {
                char x1=(l%2==0)?'0':'1';
                char x2=(l%2==0)?'1':'0';
                if(s.charAt(l)!=x1) a1--;
                if(s.charAt(l)!=x2) a2--;
                l++;
            }
            if(r-l+1==n)
            {
                ans=Math.min(ans,Math.min(a1,a2));
            }
        }
        return ans;
    }
}