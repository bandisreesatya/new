class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(String word: words){
            if(check(word)) return word;
        }
        return "";
    }
    private boolean check(String word){
        int j=word.length()-1;
        int i=0;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}