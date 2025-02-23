#include <bits/stdc++.h>
using namespace std;
class Solution { 
public: 
    int evenlyDivides(int n) { 
        if (n < 10) {
            return (n == 0) ? 0 : 1; 
        }

        int rem, count = 0;
        int temp = n; 

        while (n != 0) { 
            rem = n % 10;
            n = n / 10;   

            if (rem != 0 && temp % rem == 0) { 
                count++; 
            }
        }
        return count;
    }
};

int main() { 
    int t; 
    cin >> t;
    while (t--) { 
        int N; 
        cin >> N; 
        Solution ob; 
        cout << ob.evenlyDivides(N) << endl; 
    }
    return 0; 
}
