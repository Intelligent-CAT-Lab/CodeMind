import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

S = readline().rstrip()
N = len(S)
ans = N
ans2 = N
for i in range(N):
    if S[i] == "1":
        ans = min(ans,max(N-i-1,i))
    else:
        ans2 = min(ans2,max(N-i-1,i))
print((max(ans,ans2)))
