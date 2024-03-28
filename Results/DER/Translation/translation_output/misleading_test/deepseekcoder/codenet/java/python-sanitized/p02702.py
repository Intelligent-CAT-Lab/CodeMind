from collections import defaultdict

def solve(s):
    p = 2019
    n = len(s)
    d = [0]*(n+1)
    ten = 1
    for i in range(n-1, -1, -1):
        a = ((int(s[i]) - 0) * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p
    map = defaultdict(int)
    for i in range(n, -1, -1):
        key = d[i]
        map[key] += 1
    ans = 0
    for key in map:
        val = map[key]
        ans += (val * (val-1)) // 2
    return ans

s = input()
print(solve(s))