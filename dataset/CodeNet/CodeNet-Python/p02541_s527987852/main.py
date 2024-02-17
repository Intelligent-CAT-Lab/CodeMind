import sys
input = sys.stdin.readline

def I(): return int(input())
def MI(): return map(int, input().split())
def LI(): return list(map(int, input().split()))


"""
ざっくり見積もってもkは√N以上

1+2+...+k=Sとおく

Nが2冪なら，k=2*N-1ぽい．(k*(k+1))//2で，k,k+1の片方は奇数なのでどちらかで十分な数の2を因数に用意する必要があるのであってそう

Nが奇数なら，k=N-1でS=(N*(N-1))//2 はいける．それよりも下を探したい．
S=aNとおけばa<=(N-1)//2 で，aさえ決め打てばkを√(2aN)付近で探せたりするけど，aの範囲が広い...
また，k,k+1の片方は偶数なのでaは偶数
保留

Nが偶数なら，k=2N-1でS=(2N*(2N-1))//2 はいける．それよりも下を探したい．
素因数分解した時の2の個数をm-1個として，
k,k+1のどちらかに2をm個を持たせる必要がある(÷2させるので一つ多く)．
つまり，pow(2,m)*b,pow(2,m)*b±1のような形になるはず．
Nを2で割り続けて，残ったものがb*(pow(2,m)*b±1)とか考えたけど，
aNのaが偶数になるケースとかやばい，(N=14でk,k+1=7,8)

これ，2冪の時と同様の議論が3冪とかでもできるか．
k,k+1が互いにそなので，素因数は固めるべき．
なので，まずはNを素因数分解する，そんで持って素因数毎に固めて,k,k+1候補(a,b)を作る，小さい方をx倍していき，差が1になれば完成．
これは素因数毎にbit全探索でいける．素因数の種類は20もないでしょ．2,3,5,7...と行けば10^15はすぐ到達する．素数小さい方から15個くらいかけると10^15．

いやー，小さい方をx倍，大きい方をy倍して初めてNの倍数という可能性も．
ax-by=1なら良いので拡張ユークリッドか


N=1ならk=1
"""
def main():

    def gcd(a, b):
        while b: a, b = b, a % b
        return a
    def isPrimeMR(n):
        d = n - 1
        d = d // (d & -d)
        L = [2]
        for a in L:
            t = d
            y = pow(a, t, n)
            if y == 1: continue
            while y != n - 1:
                y = (y * y) % n
                if y == 1 or t == n - 1: return 0
                t <<= 1
        return 1
    def findFactorRho(n):
        m = 1 << n.bit_length() // 8
        for c in range(1, 99):
            f = lambda x: (x * x + c) % n
            y, r, q, g = 2, 1, 1, 1
            while g == 1:
                x = y
                for i in range(r):
                    y = f(y)
                k = 0
                while k < r and g == 1:
                    ys = y
                    for i in range(min(m, r - k)):
                        y = f(y)
                        q = q * abs(x - y) % n
                    g = gcd(q, n)
                    k += m
                r <<= 1
            if g == n:
                g = 1
                while g == 1:
                    ys = f(ys)
                    g = gcd(abs(x - ys), n)
            if g < n:
                if isPrimeMR(g): return g
                elif isPrimeMR(n // g): return n // g
                return findFactorRho(g)
    #[(p1,n1),(p2,n2),...]の形で返す
    def primeFactor(n):
        i = 2
        ret = {}
        rhoFlg = 0
        while i*i <= n:
            k = 0
            while n % i == 0:
                n //= i
                k += 1
            if k: ret[i] = k
            i += 1 + i % 2
            if i == 101 and n >= 2 ** 20:
                while n > 1:
                    if isPrimeMR(n):
                        ret[n], n = 1, 1
                    else:
                        rhoFlg = 1
                        j = findFactorRho(n)
                        k = 0
                        while n % j == 0:
                            n //= j
                            k += 1
                        ret[j] = k

        if n > 1: ret[n] = 1
        if rhoFlg: ret = {x: ret[x] for x in sorted(ret)}
        return ret


    #約数列挙
    #10^6以下で約数の数が最大なのは720720の時(240個しかない！)
    def divisors(N):
        pf = primeFactor(N)
        ret = [1]
        for p in pf:
            ret_prev = ret
            ret = []
            for i in range(pf[p]+1):
                for r in ret_prev:
                    ret.append(r * (p ** i))
        return sorted(ret)
    
    #拡張ユークリッド
    def egcd(a, b):
        if a == 0:
            return b, 0, 1
        else:
            g, y, x = egcd(b % a, a)
            return g, x - (b // a) * y, y



    mod=10**9+7
    N=I()
    if N==1:
        print(1)
        exit()
    
    pf=primeFactor(N)
    M=len(pf)
    
    L=[]
    for p in pf:
        n=pf[p]
        if p==2:
            n+=1#あとで割る2する分
        L.append(pow(p,n))
    
    if N%2==1:
        ans=N-1
    else:
        ans=2*N-1    
    
    import itertools
    for ite in itertools.product([0,1], repeat=M):
        a=1
        b=1
        for i in range(M):
            if ite[i]==0:
                a*=L[i]
            else:
                b*=L[i]
        
        # ax-by=1
        g,x,y=egcd(a,-b)
        temp=min(abs(a*x), abs(b*y))
        if temp!=0:
            ans=min(ans,temp)
        
    print(ans)
                
        


main()
