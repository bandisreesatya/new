#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> lcmAndGcd(int a, int b) {
        int gcd = __gcd(a, b);
        long long lcm = ((long long) a * b) / gcd;
        return { (int)lcm, gcd };
    }
};

int main() {
    int t = 2; 
    cout << "Test Cases: " << t << endl;

    vector<pair<int, int>> testCases = { {5, 5}, {1, 10} };

    for (auto test : testCases) {
        int A = test.first, B = test.second;
        Solution obj;
        vector<int> ans = obj.lcmAndGcd(A, B);
        cout << "Input: " << A << ", " << B << " => Output: " << ans[0] << " " << ans[1] << endl;
    }
    
    return 0;
}
