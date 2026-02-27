/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Pair{
    Node node;
    int lvl;
    Pair(Node node,int lvl)
    {
        this.node=node;
        this.lvl=lvl;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root)
    {
        // code here
        ArrayList<ArrayList<Integer>>  ans=new ArrayList<>();
        Map<Integer,List<Integer>> map=new TreeMap<>();
        if(root==null) return ans;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair temp=q.remove();
            if(!map.containsKey(temp.lvl))
            {
                map.put(temp.lvl,new ArrayList<>());
            }
            map.get(temp.lvl).add(temp.node.data);
            if(temp.node.left!=null) q.add(new Pair(temp.node.left,temp.lvl-1));
            if(temp.node.right!=null) q.add(new Pair(temp.node.right,temp.lvl+1));
        }
        for(List<Integer> mylist:map.values())
            ans.add(new ArrayList<>(mylist));
    
    return ans;
    }
}