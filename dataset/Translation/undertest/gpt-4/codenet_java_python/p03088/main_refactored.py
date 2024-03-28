class main:
    mod = 1000000007
    
    n = int(input())
    
    # Initialize the dp array with dimensions (n+1)x5x5x5 with all zeros
    dp = [[[[0]*5 for _ in range(5)] for _ in range(5)] for _ in range(n+1)]
    
    # Base case
    dp[0][0][0][0] = 1
    
    # Fill the dp array
    for i in range(1, n + 1):
        for j in range(5):
            for k in range(5):
                for l in range(5):
                    for m in range(1, 5):
                        if (j == 1 and l == 2 and m == 3) or \
                           (j == 1 and k == 2 and m == 3) or \
                           (k == 1 and l == 2 and m == 3) or \
                           (k == 1 and l == 3 and m == 2) or \
                           (k == 2 and l == 1 and m == 3):
                            continue
                        dp[i][k][l][m] = (dp[i][k][l][m] + dp[i-1][j][k][l]) % mod
    
    # Calculate the answer by summing up all valid combinations for the last three characters
    ans = 0
    for i in range(1, 5):
        for j in range(1, 5):
            for k in range(1, 5):
                ans = (ans + dp[n][i][j][k]) % mod
    
    print(ans)