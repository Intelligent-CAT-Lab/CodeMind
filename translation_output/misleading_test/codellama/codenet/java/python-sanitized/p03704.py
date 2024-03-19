import sys
import math

def solve():
    D = int(sys.stdin.readline().strip())
    ans = 0
    for len in range(1, 19):
        ans += dfs(D, 0, len)
    print(ans)

def dfs(rem, pos, len):
    if len - pos -