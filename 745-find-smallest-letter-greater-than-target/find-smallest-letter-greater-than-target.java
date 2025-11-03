class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int n=letters.length;
        boolean flag=false;
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=letters[i];
            hash.put(ch,ch-'a');
        }
        int tn=target-'a';
        int c=0;
        for(int i=0;i<n;i++)
          {
            if(tn<hash.get(letters[i]))
            {
               flag=true;
              c=hash.get(letters[i]);
               break;
            }
          }
          if(flag)
           return (char)(c+'a');
        else
        return letters[0];
    }
}