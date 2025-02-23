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
    int t;
    cin >> t;
    while (t--) {
        int A, B;
        cin >> A >> B;

        Solution obj;
        vector<int> ans = obj.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
    }
    return 0;
}
