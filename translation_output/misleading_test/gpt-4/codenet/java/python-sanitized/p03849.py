MOD = 1000000007

def f(n):
    if n in mb:
        return mb[n]
    if n <= 2:
        return n
    res = (f(n // 2) + f((n - 1) // 2) + f((n + 1) // 2)) % MOD
    mb[n] = res
    return res

if __name__ == "__main__":
    n = int(input())
    mb = {}
    print(f(n + 1))