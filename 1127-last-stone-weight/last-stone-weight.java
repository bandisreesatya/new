class Solution {
    
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int s:stones) pq.add(s);
        while(pq.size()>1)
        {
            int ele1=pq.remove();
            int ele2=pq.remove();
            if(ele1!=ele2)
              pq.add(ele1-ele2);
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}