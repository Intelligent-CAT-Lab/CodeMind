def cmb(n, r, mod):#コンビネーションの高速計算　
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r] % mod

mod = 998244353
N = 2*10**3
g1 = [1]*(N+1) # 元テーブル
g2 = [1]*(N+1) #逆元テーブル
inverse = [1]*(N+1) #逆元テーブル計算用テーブル

for i in range( 2, N + 1 ):
    g1[i]=( ( g1[i-1] * i ) % mod )
    inverse[i]=( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2[i]=( (g2[i-1] * inverse[i]) % mod )
inverse[0]=0

import time
S=input()
N=len(S)
#print(N)
start=time.time()
if N==1:
    exit(print(1))

dp=[[[-10**15 for i in range(N+2)] for j in range(N+2)] for k in range(N+1)]
dpf=[[[-10**15 for i in range(N+2)] for j in range(N+2)] for k in range(N+1)]

dpf[0][0][0]=1
if S[0]=="0":
    dp[1][1][0]=0
if S[1]=="0":
    dp[1][1][0]=0
if S[0]=="1":
    dp[1][0][1]=0
if S[1]=="1":
    dp[1][0][1]=0
dpf[1][0][0]=2
Zero=1-int(S[0])+1-int(S[1])
One=int(S[0])+int(S[1])
for i in range(2,N):
    Zero+=1-int(S[i])
    One+=int(S[i])
    for j in range(Zero+1):
        for k in range(One+1):
            a,b=1-int(S[i]),int(S[i])
            dp[i][j][k]=max(dp[i-1][j-a][k-b]-2,dpf[i-1][j-a][k-b]-1)
            a,b=1-int(S[i-1]),int(S[i-1])
            dpf[i][j][k]=max(dpf[i-1][j][k]+1,dp[i-1][j][k]+1-dp[i-1][j][k]%2)
            dp[i][j][k]=max(dp[i][j][k],2*(dpf[i-2][j-a][k-b]//2),2*(dp[i-2][j-a][k-b]//2))
            if dp[i][j][k]<0:
              dp[i][j][k]=-10**5
            if dpf[i][j][k]<0:
              dpf[i][j][k]=-10**5
    dpf[i][0][0]=i+1

med=time.time()
#print(med-start)

S=[S[-i-1] for i in range(N)]
Zero=0
One=0
ans=1
check=set([])
one,zero=S.count("1"),S.count("0")
for i in range(N):
    Zero+=(S[i]=="1")
    One+=(S[i]=="0")
    for j in range(zero+1):
        for k in range(one+1):
            if (dp[N-1-i][j][k]>=0 or dpf[N-1-i][j][k]>=0) and (j,k)!=(0,0):
                check.add((j,k))
    ncheck=set([])
    for j,k in check:
        A,B=1,1
        if j!=0:
            A=cmb(Zero+j-1,j,mod)
        if k!=0:
            B=cmb(One+k-1,k,mod)
        ans+=A*B
        ans%=mod
        a,b=1-int(S[i]),int(S[i])
        if j>=a and k>=b:
            ncheck.add((j-a,k-b))
    check=ncheck
    zero-=1-int(S[i])
    one-=int(S[i])

print(ans)

def check():
    res=0
    for i in range(N):
        for j in range(N+1):
            for k in range(N+1) :
                if data[i][j][k]:
                    print(i,j,k)
                    res+=1
    return res
#print(time.time()-start)