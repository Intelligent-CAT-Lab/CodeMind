n,a,b = list(map(int,input().split()))


"""
def power_func(a,n,p):
  bi=str(format(n,"b"))#2進表現に
  res=1
  for i in range(len(bi)):
    res=(res*res) %p
    if bi[i]=="1":
      res=(res*a) %p
  return res
"""
def cmb(n, r, p):
    #print(r)
    if (r < 0) or (n < r):
        return 0
    tmp = 1
    for i in range(r):
        tmp *= (n-i) % p
        tmp %= p
        tmp *= pow(r-i,p-2,p) % p
        tmp %= p
    return tmp%p
    #r = min(r, n - r)
    #return fact[n] * factinv[r] * factinv[n-r] % p

N = n

"""
def pow(x, n):
    ans = 1
    while n:
        if n % 2:
            ans *= x
        x *= x
        n >>= 1
        print(n,x,ans)
    return ans

pow(2,9)
exit()
"""
p = 10 ** 9 + 7
#N = 10 ** 6  # N は必要分だけ用意する
"""
fact = [1, 1]
factinv = [1, 1]
inv = [0, 1]

for i in range(2, N + 1):
    fact.append((fact[-1] * i) % p)
    inv.append((-inv[p % i] * (p // i)) % p)
    factinv.append((factinv[-1] * inv[-1]) % p)
"""
ans = (pow(2,n)-1)%p
#print(ans)
#exit()
#print(cmb(n, a, p) , cmb(n, b, p))
#print(ans,cmb(n, a, p),cmb(n, b, p))
ans -= (cmb(n, a, p) + cmb(n, b, p))

print((ans%p))