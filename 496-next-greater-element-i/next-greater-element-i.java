class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int[]  arr=new int[n1];
        Arrays.fill(arr,-1);
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
            for(int j=0;j<n2;j++)
            {
                     while(!stk.isEmpty()&&nums2[j]>stk.peek())
                     {
                        hash.put(stk.peek(),nums2[j]);
                        stk.pop();
                     }
                     stk.push(nums2[j]);
            }
            while(!stk.isEmpty())
                hash.put(stk.pop(),-1);
            for(int i=0;i<n1;i++)
                 arr[i]=hash.get(nums1[i]);
            return arr;
            }
        }
