import sys

def solve():
    D = int(input())
    ans = 0
    for len in range(1, 19):
        res = dfs(D, 0, len)
        ans += res
    print(ans)

def dfs(rem, pos, len):
    if len - pos - 1 < pos:
        return rem == 0