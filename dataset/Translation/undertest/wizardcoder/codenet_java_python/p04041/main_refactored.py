class main:
    import sys
    import math
    
    MOD = 1000000007
    inf = (1 << 31) // 2
    
    def solve():
        n = int(input())
        x = int(input())
        y = int(input())
        z = int(input())
        sum = x + y + z + 1
        mask = (1 << sum) - 1
        dp = [[0] * (mask + 1) for _ in range(n + 1)]
        ng = 0
        ng |= 1 << z
        ng |= 1 << (y + z)
        ng |= 1 << (x + y + z)
        dp[0][1] = 1
        for i in range(n):
            for state in range(mask + 1):
                for j in range(1, 11):
                    res = ((state << j) & mask) + 1
                    if (res & ng) == ng:
                        continue
                    dp[i + 1][res] += dp[i][state]
                    dp[i + 1][res] %= MOD
        ans = 1
        for i in range(n):
            ans *= 10
            ans %= MOD
        for state in range(mask + 1):
            ans -= dp[n][state]
            ans %= MOD
        print((ans + MOD) % MOD)
    
    def main():
        if len(sys.argv) > 1:
            with open(sys.argv[1]) as f:
                INPUT = f.read()
            solve()
        else:
            INPUT = sys.stdin.read()
            solve()
    
    if __name__ == '__main__':
        main()