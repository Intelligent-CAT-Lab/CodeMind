import bisect
import sys
sys.setrecursionlimit(10**9)
def main():
    N,K = map(int,"5 3".split())
    MOD = 10**9+7
    def between(n,k,i):
        if i == 1:
            return 1
        return comb(k-1,i-1,MOD)
    def comb(n, r, mod):
        r = min(r, n-r)
        res = 1
        for i in range(r):
            res = res * (n - i) * pow(i+1, mod-2, mod) % mod
        return res
    for i in range(1,K+1):
        if i > K or i > N-K+1:
            print(0)
        else:
            ans = comb(N-K+1,i,MOD) * between(N,K,i)
            ans %= MOD
            print(ans)
if __name__ == "__main__":
  main()