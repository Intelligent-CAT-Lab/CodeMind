import sys
input = lambda : sys.stdin.readline().rstrip()
sys.setrecursionlimit(max(1000, 10**9))
write = lambda x: sys.stdout.write(x+"\n")


n,k = list(map(int, input().split()))
M = 10**9+7
### 約数列挙
def fs(n):
    s = set()
    for i in range(1,int(n**0.5)+2):
        if n%i==0:
            s.add(i)
            s.add(n//i)
    l = sorted(list(s))
    return l
ds = fs(n)
m = len(ds)
nums = [None]*m
for i in range(m):
    val = pow(k, (ds[i]+1)//2, M)
    for j in range(i):
        if ds[i]%ds[j]==0:
            val -= nums[j]
            val %= M
    nums[i] = val%M
ans = 0
inv2 = pow(2, M-2, M)
for i in range(m):
    if ds[i]%2==0:
        ans += ds[i]*nums[i]*inv2
    else:
        ans += ds[i]*nums[i]
    ans %= M
print(ans%M)