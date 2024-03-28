class main:
    import sys
    
    def fact(n):
        fact = [1]
        for i in range(2, n+1):
            fact.append(i * fact[i-1])
        return fact
    
    def fact_inv(n):
        fact_inv = [1]
        for i in range(2, n+1):
            fact_inv.append(pow(fact[i], n-2, 1000000007))
        return fact_inv
    
    def solve(n, k):
        fact = fact(n)
        fact_inv = fact_inv(n)
        ans = 0
        for i in range(k+1):
            up = sum(fact[j] for j in range(n+1))
            up %= 1000000007
            den1 = sum(fact_inv[j] for j in range(i+1))
            den1 %= 1000000007
            den2 = sum(fact_inv[j] for j in range(n-i, n-1))
            den2 %= 1000000007
            den = den1 * den2
            den %= 1000000007
            ans += up * den
            ans %= 1000000007
        return ans
    
    if __name__ == "__main__":
        n = int(input())
        k = int(input())
        print(solve(n, k))