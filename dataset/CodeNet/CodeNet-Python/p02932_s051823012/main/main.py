MOD = 10**9+7

kaijo_memo = []
def kaijo(n):
  if(len(kaijo_memo) > n): return kaijo_memo[n]
  if(len(kaijo_memo) == 0): kaijo_memo.append(1)
  while(len(kaijo_memo) <= n): kaijo_memo.append(kaijo_memo[-1] * len(kaijo_memo) % MOD)
  return kaijo_memo[n]

gyaku_kaijo_memo = []
def gyaku_kaijo(n):
  if(len(gyaku_kaijo_memo) > n): return gyaku_kaijo_memo[n]
  if(len(gyaku_kaijo_memo) == 0): gyaku_kaijo_memo.append(1)
  while(len(gyaku_kaijo_memo) <= n): gyaku_kaijo_memo.append(gyaku_kaijo_memo[-1] * pow(len(gyaku_kaijo_memo),MOD-2,MOD) % MOD)
  return gyaku_kaijo_memo[n]

def nCr(n,r):
  if n == r: return 1
  if n < r or r < 0: return 0
  ret = 1
  ret = ret * kaijo(n) % MOD
  ret = ret * gyaku_kaijo(r) % MOD
  ret = ret * gyaku_kaijo(n-r) % MOD
  return ret

N,M,L,R = list(map(int,input().split()))

P = [0 for i in range(R+1)]
for k in range(R+1):
  u = (R-M*(k+1))//(k+1)
  for j in range(u+1):
    P[(k+1)*j+M*(k+1)] += nCr(N-M,j)*(-1)**(j%2)
    P[(k+1)*j+M*(k+1)] %= MOD
for k in range(1,R+1):
  u = (R-M*(k+1))//k
  for j in range(u+1):
    P[k*j+M*(k+1)] -= nCr(N-M,j)*(-1)**(j%2)
    P[k*j+M*(k+1)] %= MOD

Q = [nCr(i+N,N) for i in range(R+1)]

def f(MAX):
  ans = 0
  for t in range(MAX+1):
    ans += P[t]*Q[MAX-t]
    ans %= MOD
  return ans

def F(x):
  return (Q[x]-nCr(N,M)*f(x))%MOD

print(((F(R)-F(L-1))%MOD))