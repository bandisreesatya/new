class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        int a=operations.length;
        for(int i=0;i<a;i++)
        {
            if(operations[i].equals("++X")||operations[i].equals("X++"))
            ans++;
            else
            ans--;
        }
        return ans;
    }
}
        
    
