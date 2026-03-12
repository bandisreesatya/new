class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        int max=0,i=0;
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            map.put(ch,1+map.getOrDefault(ch,0));
            if(map.get(ch)<=1)  max=Math.max(max,j-i+1);
            else
            {
                while(i<=j)
                {
                    char rem=s.charAt(i);
                    i++;
                    map.put(rem,map.get(rem)-1);
                    if(map.get(rem)==1) break;
                }
            }
        }
        return max;
        
    }
}