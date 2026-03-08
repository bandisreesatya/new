class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
      StringBuilder str=new StringBuilder();
      for(int i=0;i<nums.length;i++)
      {
         char ch=nums[i].charAt(i);
         str.append(ch=='0'?'1':'0');
      }   
      return str.toString();
    }
}