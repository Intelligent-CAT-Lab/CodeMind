n,m=map(int,input().split())
mod=10**9+7
def combination(n, r):
    a = 1
    b = 1
    for i in range(r):
        a *= (n - i)
        b *= (i + 1)
    return a // b
def get_prime_dic(n):
    dic = {}
 
    i = 2
    while i * i <= n:
        while n % i == 0:
            n //= i
            if i in dic:
                dic[i] += 1
            else:
                dic[i] = 1
        i += 1
 
    if n > 1:
        dic[n] = 1
    return dic
d=get_prime_dic(m)
ans=1
for i,j in d.items():
    ans*=combination(n-1+j, j)
    ans%=mod


print(ans)