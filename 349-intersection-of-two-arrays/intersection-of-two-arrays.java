class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        int j=0;
       // HashMap<Integer,Integer> hash2=new HashMap<>();
        for(int i=0;i<n1;i++)
            set1.add(nums1[i]);
        for(int i=0;i<n2;i++)
            set2.add(nums2[i]);
        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<set1.size();i++)
        {
            int num=list1.get(i);
            if(set2.contains(num))
                 result.add(num);
        }
         int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            arr[i]=result.get(i);
        }
        return arr;
        
    }
}