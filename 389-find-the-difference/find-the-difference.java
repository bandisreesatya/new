class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int l=s.length();
        int l1=t.length();
        for(int i=0;i<l;i++)
           hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<l1;i++)
           hash.put(t.charAt(i),hash.getOrDefault(t.charAt(i),0)+1);
        char ch=' ';
       for (Map.Entry<Character, Integer> entry : hash.entrySet())
        {
            if (entry.getValue() % 2 != 0) 
        {
                ch= entry.getKey();
          }
        }
        
        return ch;

    }
}