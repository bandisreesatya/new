class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int[] freq=new int[26];
        int[] curr_freq=new int[26];
        List<Integer> list=new ArrayList<>();
        int n=p.length();
        int i=0,j=0;
        for(int k=0;k<n;k++)
        {
            char ch=p.charAt(k);
            freq[ch-'a']++;
        }
        for(j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            curr_freq[ch-'a']++;
            if((j-i+1)==n)
            {
                if(Arrays.equals(freq,curr_freq))
                {
                    list.add(i);
                }
                curr_freq[s.charAt(i)-'a']--;
                i++;
            }      
        }
        return list;

        
    }
}