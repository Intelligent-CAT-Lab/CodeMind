class main:
    def exp(base, e, mod):
        if e == 0:
            return 1
        if e == 1:
            return base
        val = exp(base, e // 2, mod)
        ans = (val * val) % mod
        if e % 2 == 1:
            ans = (ans * base) % mod
        return ans
    
    def main():
        s = input().strip()
        n = len(s)
        abc = {"abc", "acb", "bac", "bca", "cab", "cba"}
        diff = sum(1 for i in range(n - 1) if s[i] != s[i + 1])
        
        if n <= 2:
            if s[0] == s[1]:
                print(1)
            else:
                print(2)
        elif s in abc:
            print(3)
        elif diff == 0:
            print(1)
        else:
            mod = 998244353
            dp = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
            dp_no_dpl = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
            ans = 0 if any(s[i] == s[i+1] for i in range(n - 1)) else 1
            sum_remainders = sum((ord(char) - ord('a')) for char in s) % 3
            for j in range(3):
                dp[0][j][j] = 1
                dp_no_dpl[0][j][j] = 1
            for i in range(1, n):
                for j in range(3):
                    for k in range(3):
                        dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][1][(j + 3 - k) % 3]
                        dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][2][(j + 3 - k) % 3]
                        dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][0][(j + 3 - k + 1) % 3]
                        dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][2][(j + 3 - k + 1) % 3]
                        dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][0][(j + 3 - k + 2) % 3]
                        dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][1][(j + 3 - k + 2) % 3]
                        dp_no_dpl[i][k][j] %= mod
            ans += exp(3, n - 1, mod) + mod - dp_no_dpl[n-1][0][sum_remainders] \
                   - dp_no_dpl[n-1][1][sum_remainders] - dp_no_dpl[n-1][2][sum_remainders]
            ans %= mod
            print(ans)
    
    if __name__ == '__main__':
        main()