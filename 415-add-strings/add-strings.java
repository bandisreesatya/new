class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1;
        int sum=0,c=0;
        while(i>=0||j>=0||c>0)
        {
          int a=(i>=0)? num1.charAt(i)-'0':0;
           int b=(j>=0)? num2.charAt(j)-'0':0;
           sum=a+b+c;
           str.append(sum%10);
           c=sum/10;
           i--;j--;
        }
        return str.reverse().toString();
    }
}