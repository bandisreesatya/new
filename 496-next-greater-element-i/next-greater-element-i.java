class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stk=new Stack<>();
        int[] ans=new int[nums1.length];
        for(int x : nums2){
            while(!stk.isEmpty() && x>stk.peek()){
                map.put(stk.pop(),x);
            }
            stk.push(x);
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}