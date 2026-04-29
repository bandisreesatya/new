class Solution {
    public boolean isPalindrome(String s){
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int j=s.length()-1;
        int i=0;
        while(i<=j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;j--;
        }
        return true;
        
    }
}