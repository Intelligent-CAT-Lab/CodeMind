```python
MOD = 1000000007

class Point:
    def __init__(self):
        self.coeff = [0] * n

    def __eq__(self, other):
        if self is other:
            return True
        if other is None or self.__class__ != other.__class__:
            return False
        return self.coeff == other.coeff

    def __hash__(self):
        return hash(tuple(self.coeff))

def get_comb(sz, mod):
    comb = [[0 for _ in range(sz)] for _ in range(sz)]
    for i in range(sz):
        comb[i][0] = 1
        for j in range(1, i + 1):
            comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1]
            if comb[i][j] >= mod:
                comb[i][j] -= mod
    return comb

def deep_fill(x, val):
    for y in x:
        if isinstance(y, list):
            deep_fill(y, val)
        else:
            y = val

def dfs(left, excess):
    if dp[left][excess] != -1:
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
            ret = (ret + dfs(left - pos - neg, t // 2) * comb[left][pos] % MOD * comb[left - pos][neg]) % MOD
    return ret

if __name__ == '__main__':
    n = int(input())
    ps = [Point() for _ in range(n)]
    comb = get_comb(n + 10, MOD)
    dp = [[-1 for _ in range(101)] for _ in range(n + 10)]
    result = (n * (dfs(n - 1, 0) + dfs(n - 1, 1))) % MOD
    print(result)
```

