class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,1+map.getOrDefault(ch,0));
        }
        for(int i=0;i<t.length();i++){
            char chh=t.charAt(i);
            if(!map.containsKey(chh)) return false;
            map.put(chh,map.get(chh)-1);
            if(map.get(chh)==0){
                map.remove(chh);
            }
        }
        return map.isEmpty();
    }
}