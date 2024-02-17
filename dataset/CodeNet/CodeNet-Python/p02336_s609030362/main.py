#!python3

iim = lambda: map(int, input().rstrip().split())

def cmb(a, b):
    if a == b or b == 0: return 1
    c = a - b
    if b > c:
        return cmb(a, c)

    ans = 1
    for i in range(a, a - b, -1):
        ans *= i
    from math import factorial
    return ans // factorial(b)

def resolve():
    N, K = iim()
    mod = 10**9 + 7

    if N < K:
        print(0)
        return

    print(cmb(N-1, N-K) % mod)

if __name__ == "__main__":
    resolve()

