n,m,k=map(int,input().split())
ans=0
def cmb(n, r, mod):
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r] % mod

mod = 998244353 #出力の制限
N = 2*10**5
g1 = [1, 1] # 元テーブル
g2 = [1, 1] #逆元テーブル
inverse = [0, 1] #逆元テーブル計算用テーブル

for i in range( 2, N + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )


  
kk=n-k
#print(kk)
color=m*(m-1)**(kk-1)%mod
#print(color)
while kk<=n:
  now=color
  color=color*(m-1)%mod
  now=now*(cmb((n-1),(n-kk),mod))%mod
  kk+=1
  ans+=now
  ans=ans%mod
  #print(kk)
  #print(now)
  #print("color",color,"com",com)
print(ans)
  