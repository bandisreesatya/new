class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        
     int rev=0,rem=0;
        int temp;
        temp=x;
        if(x<0)
        {
            return false;
        }
         while (x != 0) {
            // Check for integer overflow before updating rev
            if (rev > (INT_MAX - x % 10) / 10) return false; 
            
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return temp==rev;

        
        
        
    }
};