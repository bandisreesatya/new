class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        int n=nums[0].length();
        int i=0,max=(1<<n);
        for(int j=0;j<nums.length;j++)
        {
            String str=nums[j];
            int num=Integer.valueOf(str,2);
            list.add(num);
        }
        while(i<max)
        {
            if(!list.contains(i))
            {
                String str = Integer.toBinaryString(i);
                while(str.length()<n) str="0"+str;
                return str;
            }

            i++;
        }
    return "";
        
    }
}