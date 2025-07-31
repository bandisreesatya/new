class Solution {
    public String defangIPaddr(String address) {
        int a=address.length();
        String s="";
        for(int i=0;i<a;i++)
        {
            if(address.charAt(i)=='.')
            s+="[.]";
            else
            s+=address.charAt(i);
                   
        }
        return s;
        
    }
}