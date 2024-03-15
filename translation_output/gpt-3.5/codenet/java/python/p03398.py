```python
import sys
from collections import defaultdict

mod = 1000000007
n = 0
comb = {}
dp = {}
pp = set()

class Point:
    def __init__(self, n):
        self.coeff = [0] * n

def main():
    global n
    n = int(input())
    
    ps = [Point(n) for _ in range(n)]
    
    for i in range(n):
        ps[i].coeff[i] = 1
    
    global pp
    pp = set()
    
    global comb
    comb = get_comb(n + 10, mod)
    
    global dp
    dp = defaultdict(lambda: defaultdict(int))
    
    result = (n * (dfs(n - 1, 0) + dfs(n - 1, 1))) % mod
    print(result)

def dfs(left, excess):
    if dp[left][excess]:
        return dp[left][excess]
    
    if left == 0:
        return 1 if excess == 0 else 0
    
    ret = 0
    
    for pos in range(left + 1):
        for neg in range(left - pos + 1):
            if pos + neg == 0:
                continue
            take = pos + neg
            if excess > take + 1:
                continue
            t = abs(excess + pos - neg)
            if t % 2 != 0:
                continue
            ret = (ret + dfs(left - pos - neg, t // 2) * comb[left][pos] % mod * comb[left - pos][neg]) % mod
    
    return ret

def get_comb(sz, mod):
    comb = {}
    for i in range(sz):
        comb[i] = [0] * (i + 1)
        comb[i][0] = 1
        for j in range(1, i + 1):
            comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1]
            if comb[i][j] >= mod:
                comb[i][j] -= mod
    return comb

if __name__ == "__main__":
    main()
```
