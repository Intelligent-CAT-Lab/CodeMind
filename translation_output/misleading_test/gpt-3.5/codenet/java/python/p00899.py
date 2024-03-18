```python
from sys import stdin
from math import inf

class AOJ1320:
    def __init__(self):
        self.N = 0
        self.N2 = 0
        self.INF = 1 << 29
    
    def solve(self):
        lines = [input() for _ in range(self.N)]
        
        eq = [False] * self.N
        for i in range(self.N):
            if eq[i]:
                continue
            for j in range(self.N):
                if i != j and not eq[j] and lines[i].find(lines[j]) != -1:
                    eq[j] = True
        
        str2 = [lines[i] for i in range(self.N) if not eq[i]]
        self.N2 = len(str2)
        
        len_matrix = [[0] * self.N2 for _ in range(self.N2)]
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                while offset < l:
                    if str2[j].startswith(str2[i][offset:]):
                        break
                    offset += 1
                len_matrix[i][j] = len(str2[j]) - (l - offset)
        
        dp = [[inf] * self.N2 for _ in range(1 << self.N2)]
        for i in range(self.N2):
            dp[1 << i][i] = len(str2[i])
        
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if i & (1 << k) > 0:
                        continue
                    new_idx = i | (1 << k)
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_matrix[j][k])
        
        ans = self.INF
        tmp = (1 << self.N2) - 1
        for i in range(self.N2):
            ans = min(ans, dp[tmp][i])
        
        print(ans)

def main():
    aoj = AOJ1320()
    while True:
        try:
            aoj.N = int(input())
            if aoj.N == 0:
                break
            aoj.solve()
        except EOFError:
            break

if __name__ == '__main__':
    main()
```
