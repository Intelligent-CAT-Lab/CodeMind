class main:
    import sys
    
    def exp(base, e, mod):
        if e == 0:
            return 1
        if e == 1:
            return base
        val = exp(base, e//2, mod)
        ans = (val*val) % mod
        if e % 2 == 1:
            ans = (ans*base) % mod
        return ans
    
    n = int(input())
    abc = set(["abc", "acb", "bac", "bca", "cab", "cba"])
    diff = 0
    for i in range(n-1):
        if ord(input()[i]) != ord(input()[i+1]):
            diff += 1
    if n <= 2:
        if input()[0] == input[1]:
            print(1)
        else:
            print(2)
    else:
        if abc.issubset(input()):
            print(3)
        elif diff == 0:
            print(1)
        else:
            mod = 998244353
            dp = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
            dp_no_dpl = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
            ans = 1
            for i in range(n-1):
                if input()[i] == input[i+1]:
                    ans = 0
            sum = 0
            for i in range(n):
                sum += ord(input[i]) - ord('a')
                sum %= 3
            dp[0][0][0] = 1
            dp[0][1][1] = 1
            dp[0][2][2] = 1
            dp_no_dpl[0][0][0] = 1
            dp_no_dpl[0][1][1] = 1
            dp_no_dpl[0][2][2] = 1
            for i in range(1, n):
                for j in range(3):
                    dp_no_dpl[i][0][j] += dp_no_dpl[i-1][1][(j+3-0)%3] + dp_no_dpl[i-1][2][(j+3-0)%3]
                    dp_no_dpl[i][1][j] += dp_no_dpl[i-1][0][(j+3-1)%3] + dp_no_dpl[i-1][2][(j+3-1)%3]
                    dp_no_dpl[i][2][j] += dp_no_dpl[i-1][0][(j+3-2)%3] + dp_no_dpl[i-1][1][(j+3-2)%3]
                    for k in range(3):
                        dp_no_dpl[i][k][j] %= mod
            ans += exp(3, n-1, mod) + mod
            ans += 1*3*mod - dp_no_dpl[n-1][0][sum]