#include <bits/stdc++.h>
using namespace std;

class Solution { 
public: 
  int evenlyDivides(int n) { 
        int count = 0, temp = n; 

        while (n > 0) { 
            int rem = n % 10; 
            n /= 10; 
            if (rem != 0 && temp % rem == 0) { 
                count++; 
            }
        }
        return count;
    }
};

int main() { 
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t; 
    cin >> t; 

    while (t--) { 
        int N; 
        cin >> N; 
        Solution ob; 
        cout << ob.evenlyDivides(N) << "\n"; 
    }
    return 0; 
}
