def cmb(n, r, mod):#コンビネーションの高速計算　
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r] % mod

mod = 10**9+7 #出力の制限
N = 5000
g1 = [1, 1] # 元テーブル
g2 = [1, 1] #逆元テーブル
inverse = [0, 1] #逆元テーブル計算用テーブル

for i in range( 2, N + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )

N,K=map(int,input().split())

if N==1:
    print(1)
elif K==1:
    print(pow(2,N-2,mod))
elif K==N:
    dp=[[0 for i in range(K+1)] for j in range(K)]
    imos=[0]*(K+1)

    dp[0][K]=1
    imos[K]=1

    for i in range(1,K):
        for j in range(K-i,K+1):
            if j==K-i:
                dp[i][j]=(imos[K]-imos[j])%mod
            else:
                dp[i][j]=(dp[i-1][j]+imos[K]-imos[j])%mod
        imos=[dp[i][j] for j in range(K+1)]
        for j in range(1,K+1):
            imos[j]+=imos[j-1]
            imos[j]%=mod
    print(dp[N-1][1])
else:
    dp=[[0 for i in range(K+1)] for j in range(K)]
    imos=[0]*(K+1)

    dp[0][K]=1
    imos[K]=1

    for i in range(1,K):
        for j in range(K-i,K+1):
            if j==K-i:
                dp[i][j]=(imos[K]-imos[j])%mod
            else:
                dp[i][j]=(dp[i-1][j]+imos[K]-imos[j])%mod
        imos=[dp[i][j] for j in range(K+1)]
        for j in range(1,K+1):
            imos[j]+=imos[j-1]
            imos[j]%=mod

    ans=0
    for M in range(N-K+1,N+1):
        id=M-N+K
        ans+=dp[K-1][id]*cmb(M-2,N-K-1,mod)

    ans*=pow(2,N-K-1,mod)
    print(ans%mod)