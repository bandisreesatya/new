class Solution {
    public int bitwiseComplement(int n)
    {
      int bits = Integer.toBinaryString(n).length();
      int ans = ((1 << bits) - 1) ^ n;
      return ans;
}
}