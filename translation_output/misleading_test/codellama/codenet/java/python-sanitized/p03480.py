import math

def solve(s):
    n = len(s)
    ans = n - 1
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            tmp = max(i + 1, n - i - 2)
            ans = min(ans, tmp)
    return ans

s = input()
print(solve(s))