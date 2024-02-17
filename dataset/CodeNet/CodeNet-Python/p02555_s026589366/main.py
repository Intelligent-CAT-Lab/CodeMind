#n=int(input())
#n,m=map(int,input().split())
#a=list(map(int,input()))
#ab=[list(map(int,input().split())) for _ in range(n)]
#s=input()
s=int(input())
mod=pow(10,9)+7
ans=0

# コンビネーション、さらに高速。あらかじめO(N)の計算をすることでのちの計算が早くなる
def cmb(n,r,mod):
  if (r<0 or r>n):
    return 0
  r=min(r,n-r)
  return g1[n]*g2[r]*g2[n-r]%mod
g1=[1,1] # g1[i]=i! % mod　:階乗
g2=[1,1] # g2[i]=(i!)^(-1) % mod　:階乗の逆元
inverse=[0,1]
for i in range(2,s+1):
  g1.append((g1[-1]*i)%mod)
  inverse.append((-inverse[mod%i]*(mod//i))%mod)
  g2.append((g2[-1]*inverse[-1])%mod)


# 長さkの数列の個数
for k in range(1,s//3+1):
  sk=s-k*3
  tmp=cmb(sk+k-1,k-1,mod)
  ans+=tmp
  ans%=mod
print(ans)