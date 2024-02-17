n,m,k=map(int,"2 2 2".split())
num=n*m
MOD = 10**9+7
def inv_mod(a, p=MOD):
    def inv_mod_sub(a, p):
        if a == 1:
            return 1, 0
        else:
            d, r = p//a, p%a
            x, y = inv_mod_sub(r, a)
            return y-d*x, x
    if p < 0: p = -p
    a %= p
    return inv_mod_sub(a,p)[0] % p
def comb_mod(n, k):
    if k < 0 or k > n:
        return 0
    else:
        return f_mod[n]*f_mod_inverse[k]*f_mod_inverse[n-k] % MOD
f_mod=[1]*(num+1)
f_mod_inverse=[1]*(num+1)
for i in range(1,num+1):
  f_mod[i]=f_mod[i-1]*i%MOD
  f_mod_inverse[i]=f_mod_inverse[i-1]*inv_mod(i)%MOD
N=0;M=0
for i in range(1,n):
  N+=i*(n-i)
  N%=MOD
for i in range(1,m):
  M+=i*(m-i)
  M%=MOD
print((N*(m**2)%MOD+M*(n**2)%MOD)*comb_mod(n*m-2,k-2)%MOD)