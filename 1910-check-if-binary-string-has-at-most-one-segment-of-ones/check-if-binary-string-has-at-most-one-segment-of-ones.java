class Solution {
    public boolean checkOnesSegment(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1') c++;
            if(ch=='0') break;
        }
        if(c==map.get('1')) return true;
        return false;
}
}