class main:
    import sys
    
    def modI(a, m):
        if a % m == 0 or a % m == 1:
            return 1
        else:
            return ((1 - modI(m % a, a) * m) / a + m) % m
    
    def nCk(n, k):
        if k > n:
            return 0
        if k == 0 or k == n:
            return 1
        return nCk(n-1, k) * (n-k) / k
    
    def main():
        n, a, b, k = map(int, sys.stdin.readline().split())
        ans = 0
        for i in range(n+1):
            if a * i <= k and (k - a * i) % b == 0 and (k - a * i) / b <= n:
                ans += nCk(n, i) * nCk((k - a * i) / b, n - i)
        print ans % 998244353
    
    if __name__ == '__main__':
        main()