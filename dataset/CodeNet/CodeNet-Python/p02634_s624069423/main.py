a,b,c,d=map(int,input().split())

#ここまでのパテーン
#dp[y][x]=dp[y][x-1]*y +dp[y-1][x]*x

dp=[[0]*(d) for _ in range(c)]
dp[a-1][b-1]=1
mod=998244353

if a==c and b==d:
    print(1)
    exit()

if a==c:
    print((a**(d-b))%mod)
    exit()
if b==d:
    print((b**(c-a))%mod)
    exit()


for y in range(a-1,c):
    for x in range(b-1,d):
        
        dp[y][x]+=dp[y][x-1]*(y+1)+dp[y-1][x]*(x+1)-dp[y-1][x-1]*x*y
        dp[y][x]=dp[y][x]%mod
        #print(y,x,dp[y][x])

print(dp[-1][-1]%mod)

