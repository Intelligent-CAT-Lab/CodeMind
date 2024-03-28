class main:
    import sys
    
    M = 998244353
    
    def modI(a, m):
        if ((a %= m) <= 1):
            return 1
        return ((1 - modI(m % a, a) * m) // a + m) % m
    
    def nck(n):
        nck = [1]*(n+1)
        for i in range(1, n+1):
            nck[i] = nck[i-1]*(n-i+1) % M * modI(i, M) % M
        return nck
    
    def solve(n, a, b, k):
        ans = 0
        nck = nck(n)
        for i in range(n+1):
            if (a*i <= k):
                if ((k-a*i) % b == 0 and (k-a*i)//b <= n):
                    ans += nck[i]*nck[(k-a*i)//b] % M
        return ans % M
    
    def main():
        n, a, b, k = map(int, sys.stdin.readline().split())
        print(solve(n, a, b, k))
    
    if __name__ == "__main__":
        main()