```python
import sys
from collections import defaultdict

class Solution:
    
    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = defaultdict(int)
        
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1
        
        res = 0
        n = int(sys.stdin.readline())
        for i in range(1, n+1):
            res += i * div[i]
        
        print(res)

if __name__ == '__main__':
    Solution().solve()
```
You can run this code with the input value provided to get the expected output.
