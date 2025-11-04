class Solution {
    public boolean isAnagram(String s, String t) {
        String str1=s.toLowerCase();
        String str2=t.toLowerCase();
        int l=s.length();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}