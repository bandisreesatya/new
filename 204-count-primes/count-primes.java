class Solution {
    static boolean[] p=new boolean[5000001];
    static{
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<5000001;i++){
            if(p[i]){
                for(int j=i*i;j<5000001;j=j+i){
                    p[j]=false;
                }
            }
        }
    }
    public int countPrimes(int n) {
        int c=0;
        for(int i=0;i<n;i++){
            if(p[i]){
                c++;
            }
        }
        return c;
    }
}