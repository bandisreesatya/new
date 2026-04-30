class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums){
        visited=new boolean[nums.length];
        backtrack(nums);
        return res;
    }
    private void backtrack(int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            temp.add(nums[i]);
            backtrack(nums);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}