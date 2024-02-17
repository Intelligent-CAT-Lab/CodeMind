
"""
Writer: SPD_9X2
https://atcoder.jp/contests/arc102/tasks/arc102_c

各Kに関して O(N)くらいで求める必要がある
とあるkについて考えてみようか

kが奇数の時を考える。

1,k-1
2,k-2
3,k-3
…

の各ペアに関して片方のみ登場していい。
登場して良い数字の選び方は2^(k/2)通り
登場していいのに出ないやつがいると、重複する
包除原理で消すか？ t(=k/2)ペアあるとする。いつ出ても構わないのがx個あったとする

{2^t * H(n,x+t) } - tC1 * {2^(t-1) * H(n,x+t-1) } + tC2 * {}　…
で求まる。 計算量はO(K)くらい

kが偶数の時は,k/2が1度だけ登場する or しないを選んでおく
登場すると決めたら,nが1だけ小さくなる　後は同様にやるだけ

tの数、k/2 じゃないじゃん
→これを考え直さなきゃ k > Kのとき上手く計算できない
l,rで考えよう→ rが最大はK なのでl最小は k-K
k-K-1をKから引くと K-(k-K-1) = 2*K-k+1 の長さ
ここから両端からとっていくので　t = (2*K-k)//2となる


"""

#modのn!と、n!の逆元を格納したリストを返す(拾いもの)
#factorialsには[1, 1!%mod , 2!%mod , 6!%mod… , n!%mod] が入っている
#invsには↑の逆元が入っている

def modfac(n, MOD):
 
    f = 1
    factorials = [1]
    for m in range(1, n + 1):
        f *= m
        f %= MOD
        factorials.append(f)
    inv = pow(f, MOD - 2, MOD)
    invs = [1] * (n + 1)
    invs[n] = inv
    for m in range(n, 1, -1):
        inv *= m
        inv %= MOD
        invs[m - 1] = inv
    return factorials, invs

def modnCr(n,r,mod,fac,inv): #上で求めたfacとinvsを引数に入れるべし(上の関数で与えたnが計算できる最大のnになる)
    return fac[n] * inv[n-r] * inv[r] % mod

def modnHr(n,r,mod,fac,inv):
    return modnCr(n+r-1,n,mod,fac,inv)

K,N = map(int,input().split())
mod = 998244353
fac,inv = modfac(N+K+10,mod)

for k in range(2,2*K+1):

    ans = 0

    if k % 2 == 1: #奇数の時
        if k <= K:
            t = k // 2
        else:
            t = (2*K-k+1)//2
        x = K - t*2

        if x == 0:
            end = t
        else:
            end = t+1

        for u in range(0,end):
            now = modnCr(t,u,mod,fac,inv) * pow(2,t-u,mod) * modnHr(N,x+t-u,mod,fac,inv)
            if u % 2 == 0:
                ans += now
            else:
                ans -= now
            ans %= mod
            #print (u,now)

    else: #偶数の時

        if k <= K:
            t = (k-1) // 2
        else:
            t = (2*K-k)//2
 
        x = K - t*2 - 1

        if x == 0:
            end = t
        else:
            end = t+1

        for u in range(0,end):
            now = modnCr(t,u,mod,fac,inv) * pow(2,t-u,mod) * ( modnHr(N,x+t-u,mod,fac,inv) + modnHr(N-1,x+t-u,mod,fac,inv) )
            if u % 2 == 0:
                ans += now
            else:
                ans -= now
            ans %= mod
            #print (u,now)

    
    print (ans % mod)
