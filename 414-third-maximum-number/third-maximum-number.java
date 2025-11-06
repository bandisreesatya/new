class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
             set.add(nums[i]);
        List<Integer> list = new ArrayList<>(set);
        if(set.size()<3)
            return list.get(set.size()-1);
        else
            return list.get(set.size()-3);
    }
}