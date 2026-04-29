class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n=words.length;
        StringBuilder str=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(i>0)
            str.append(words[i]).append(" ");
            else
            str.append(words[i]);
        }
        return str.toString();
      
   
    }
}