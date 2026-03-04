class Solution {
    public String[] sortPeople(String[] names, int[] heights)
    {
        TreeMap<Integer,String> tree=new TreeMap<>(Collections.reverseOrder());
        String[] Str=new String[heights.length];
        for(int i=0;i<heights.length;i++)
            tree.put(heights[i],names[i]);
        int j=0;
        for(String s:tree.values())
             Str[j++]=s;
        return Str;
    }
}