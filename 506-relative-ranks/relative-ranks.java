class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] arr= score.clone();
        Arrays.sort(arr);
        String result[]=new String[n];
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
          hash.put(arr[i],n-i);
        for(int i=0;i<n;i++)
        {
            int num=hash.get(score[i]);
            if(num==1)
              result[i]="Gold Medal";
            else if(num==2)
              result[i]="Silver Medal";
            else if(num==3)
              result[i]="Bronze Medal";
            else
              result[i]=String.valueOf(num);
        }
        return result;
    
        
    }
}