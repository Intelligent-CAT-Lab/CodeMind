def cmb(n, r, mod):#コンビネーションの高速計算　
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return (g1[n] * g2[r])%mod * g2[n-r] % mod

mod = 10**9+7 #出力の制限
N = 4*10**6
g1 = [1]*(N+1) # 元テーブル
g2 = [1]*(N+1) #逆元テーブル
inverse = [1]*(N+1) #逆元テーブル計算用テーブル

for i in range( 2, N + 1 ):
    g1[i]=( ( g1[i-1] * i ) % mod )
    inverse[i]=( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2[i]=( (g2[i-1] * inverse[i]) % mod )

N,K=map(int,input().split())

if K==1:
    print(1)
    exit()

dp=[0 for i in range(N+1)]
dp[N]=1

for i in range(N,-1,-1):
    for j in range(i-1,-1,-1):
        n=(N-(j+1))*(K-1)+N-i
        dp[j]+=(cmb(n+K-2,K-2,mod)*dp[j+1])%mod
        dp[j]%=mod

print((dp[0]*g1[N])%mod)
