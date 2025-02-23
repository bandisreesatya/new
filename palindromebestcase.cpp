#include <iostream>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;  

        if (x >= 0 && x < 10)  
            return true;  

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return (x == rev || x == rev / 10);
    }
};

int main() {
    Solution obj;
    int test_cases[] = {7, 3, 0, -5, 10, -121};

    for (int x : test_cases) {
        cout << "Input: " << x << " | Output: " << obj.isPalindrome(x) << endl;
    }

    return 0;
}
