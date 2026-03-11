class Solution {
    public String minWindow(String s, String t)
    {
        if(t.length()>s.length()) return "";
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<t.length();i++)
           freq.put(t.charAt(i),1+freq.getOrDefault(t.charAt(i),0));
        int stillNeed=freq.size();
        int i=0,min=Integer.MAX_VALUE;
        int ans_ws=0,ans_we=0;
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            if(freq.containsKey(ch))
            {
               freq.put(ch,freq.get(ch)-1);
               if(freq.get(ch)==0)
                   stillNeed--;
            }
            if(stillNeed==0)
              {
        
                   while(i<=j&&stillNeed==0)
                {
                           if(j-i+1<min)
                        {
                            min=j-i+1;
                            ans_ws=i;
                            ans_we=j;
                        }
                    char rem=s.charAt(i);
                    i++;
                    if(freq.containsKey(rem))
                    {
                      freq.put(rem,freq.get(rem)+1);
                       if(freq.get(rem)>0)
                           stillNeed++;
                    }
                }
            }

        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(ans_ws,ans_we+1);
            
        }
    }
