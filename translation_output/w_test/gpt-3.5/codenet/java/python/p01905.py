```python
import sys

class Solution:
    def solve(self):
        N, M = map(int, input().split())
        
        a = [0] * N
        
        for i in range(M):
            a[i] = int(input())
        
        b = [True] * (N * 2 - 1)
        
        for i in range(M):
            b[a[i] + N - 1] = False
        
        for i in range(N*2-2, 0, -2):
            if b[i] and b[i-1]:
                b[(i-2)//2] = True
            elif b[i] or b[i-1]:
                b[(i-2)//2] = True
            else:
                b[(i-2)//2] = False
        
        ans = 0
        for i in range(N-1):
            if b[i*2+1] and b[i*2+2]:
                ans += 1
        
        print(ans)

if __name__ == "__main__":
    solution = Solution()
    solution.solve()
```

