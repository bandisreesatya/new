#include <iostream>
#include <climits>
using namespace std;

class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int rem = x % 10;
            if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && rem > 7)) return 0;
            if (rev < INT_MIN / 10 || (rev == INT_MIN / 10 && rem < -8)) return 0;
            
            rev = rev * 10 + rem;
            x /= 10;
        }
        
        return rev;
    }
};

int main() {
    Solution obj;
    int test_cases[] = {2147483647, -2147483648, 1534236469, -1563847412};
    
    for (int x : test_cases) {
        cout << "Input: " << x << " | Reversed: " << obj.reverse(x) << endl;
    }
    
    return 0;
}
