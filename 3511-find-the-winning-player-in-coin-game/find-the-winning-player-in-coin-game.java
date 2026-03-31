class Solution {
    public String winningPlayer(int x, int y) {
      int n=Math.min(x,(y/4));
      return n%2==1?"Alice":"Bob";
    }
}