class Solution {
    public int minOperations(String s) 
    {
      char[] arr=s.toCharArray();
      int c1=0,c2=0;
      for(int i=0;i<arr.length;i++)
      {
       if(i%2==0&&arr[i]=='0')c1++;
        if(i%2==1&&arr[i]=='1') c1++;
       if(i%2==0&&arr[i]=='1')c2++;
        if(i%2==1&&arr[i]=='0') c2++;
      }
      return Math.min(c1,c2);

    }
}