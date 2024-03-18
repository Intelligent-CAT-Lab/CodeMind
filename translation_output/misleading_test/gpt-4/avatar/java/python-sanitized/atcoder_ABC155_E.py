def atcoder_ABC155_E(S):
    S = "0" + S
    c = list(map(int, list(S)))
    N = len(c)
    dp = [[float('inf')] * 2 for _ in range(N + 1)]
    dp[N][0] = c[0]
    dp[N][1] = 10 - c[0]

    for i in range(N - 1, -1, -1):
        dp[i] = [float('inf'), float('inf')]
        for j in range(2):
            for k in range(10):
                tmp = c[i] + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i + 1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i + 1][j] + tmp + k)

    return dp[0][0]


# Test case
input_value = "10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"
expected_output = -1
# by the problem statement constraints, expected_output can never be -1,
# so this is either part of modified test case with invalid input,
# or a misinterpretation of the problem statement. For illustrative purposes, 
# if we run the test case, the expected_output would be an integer:
print(atcoder_ABC155_E(input_value))