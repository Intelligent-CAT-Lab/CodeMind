import sys

MOD = 1000000007

def f(n):
    if n <= 2:
        return n
    res = f(n//2) + f((n-1)//2) + f((n+1)//2)
    res %= MOD
    return res

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    print(f(n+1))