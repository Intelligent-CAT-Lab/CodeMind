MOD = 1000000007

def f(n):
    if n <= 2:
        return n
    return (f(n/2) + f((n-1)/2) + f((n+1)/2)) % MOD

n = int(raw_input())
print f(n+1)