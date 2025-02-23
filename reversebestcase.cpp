#include <iostream>
using namespace std;

class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {  
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        
        return rev;
    }
};

int main() {
    Solution obj;
    
   int test_cases[] = {5, -3, 0, 9, -8};

    for (int x : test_cases) {
        cout << "Input: " << x << " | Reversed: " << obj.reverse(x) << endl;
    }

    return 0;
}
