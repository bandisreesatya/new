class Solution {
    List<List<Integer>> res =  new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target);
        return res;
    }
    private void backtrack(int idx,int[] can,int T){
        if(T==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<can.length;i++){
            if(can[i]>T){
                continue;
            }
            temp.add(can[i]);
            backtrack(i,can,T-can[i]);
            temp.remove(temp.size()-1);
        }
    }
}