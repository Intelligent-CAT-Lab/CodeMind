import sys

MOD = int(1e9 + 7)

def modinv(x, m):
    return pow(x, m-2, m)

def modmul(x, y, m):
    return (x * y) % m

def modadd(x, y, m):
    return (x + y) % m

def modsub(x, y, m):
    return (x - y + m) % m

class Factorial:
    def __init__(self, limit, modular):
        self.modular = modular
        self.fact = [1] * (limit + 1)
        self.inv = [1] * (limit + 1)
        for i in range(1, limit + 1):
            self.fact[i] = modmul(self.fact[i - 1], i, modular)
            self.inv[i] = modmul(self.inv[i - 1], modinv(i, modular), modular)
        
    def get_fact(self, n):
        return self.fact[n]
    
def solve(n, h, d):
    fact = Factorial(n, MOD)
    dp = [0] * (h + 1)
    dp[0] = fact.get_fact(n)
    fact_sum = sum(fact.get_fact(i) for i in range(1, n+1)) % MOD
    pre_dp_sum = [dp[0]] + [0] * h
    for i in range(1, h+1):
        dp[i] = pre_dp_sum[i-1]
        if i - d - 1 >= 0:
            dp[i] = modsub(dp[i], pre_dp_sum[i-d-1], MOD)
        if i < h:
            dp[i] = modmul(dp[i], fact_sum, MOD)
        pre_dp_sum[i] = modadd(pre_dp_sum[i-1], dp[i], MOD)
    
    return dp[h]

def main():
    n, h, d = map(int, input().split())
    print(solve(n, h, d))

if __name__ == "__main__":
    main()