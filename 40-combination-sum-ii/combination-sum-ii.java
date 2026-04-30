class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        backtrack(0,candidates,target);
        return res;
    }
    private void backtrack(int idx,int[] can,int T){
        if(T==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<can.length;i++){
            if(i>idx&&can[i]==can[i-1]){
                continue;
            }
            if(can[i]>T){
                continue;
            }
            temp.add(can[i]);
            backtrack(i+1,can,T-can[i]);
            temp.remove(temp.size()-1);
        }
    }
}