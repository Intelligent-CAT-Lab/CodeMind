class main:
    import sys
    
    mod = 1000000007
    dp = [[0 for i in range(2)] for j in range(100010)]
    
    n, m = map(int, sys.stdin.readline().split())
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
     1000000007
    
    n = int(input())
    
    dp = [[0 for i in range(2)] for j in range(100010)]
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    /p00393.py
    import sys
    
    mod = 1000000007
    dp = [[0 for i in range(2)] for j in range(100010)]
    
    n, m = map(int, sys.stdin.readline().split())
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
    # import sys
    #
    # mod = 1000000007
    # dp = [[0 for i in range(2)] for j in range(100010)]
    #
    # n, m = map(int, sys.stdin.readline().split())
    #
    # dp[0][0] = 1
    # for i in range(1, n + 1):
    #     dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
    #     dp[i][0] %= mod
    #     dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
    #     dp[i][1] %= mod
    #     if i - m >= 0:
    #         dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    #
    # print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
    # mod =/p00392.py
    import sys
    
    n = int(input())
    
    dp = [[0 for i in range(2)] for j in [i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    range(100010)]
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
    mod = 1000000007
    
    n = int(input())
    
    dp = [[0 for i in range(2)] for j in range(100010)]
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod
    
    print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
    
    mod = 1000000007
    
    n = int(input())
    
    dp = [[0 for i in range(2)] for j in range(100010)]
    
    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0