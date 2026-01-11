class Solution {
    public boolean isPalindrome(String s)
     {
     String str="";
     boolean flag=true;
     int n=s.length();
     String s1=s.toLowerCase();
     for(int i=0;i<n;i++)
     {
        char ch=s1.charAt(i);
        if(ch>='a'&&ch<='z'||Character.isDigit(ch))
          str+=ch;
     }   
     for(int i=0;i<str.length();i++)
     {
       char ch1=str.charAt(i);
       char ch2=str.charAt(str.length()-i-1);
       if(ch1!=ch2)
          {
            flag=false;
            break;
          }
     }
     return flag;
    }
}