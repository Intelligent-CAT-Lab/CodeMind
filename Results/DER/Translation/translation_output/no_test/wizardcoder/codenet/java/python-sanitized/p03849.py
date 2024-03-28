import java.util.HashMap

MOD = 1000000007

def f(n):
    if n <= 2:
        return n
    if n in mb:
        return mb[n]
    res = f(n//2) + f((n-1)//2) + f((n+1)//2)
    res %= MOD
    mb[n] = res
    return res

n = int(input())
mb = {}
print(f(n+1))