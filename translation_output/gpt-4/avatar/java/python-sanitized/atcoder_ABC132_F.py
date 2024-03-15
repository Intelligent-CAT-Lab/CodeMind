def atcoder_ABC132_F():
    mod = 10**9 + 7
    
    # Read input from user
    n, k = map(int, input().split())

    # Computing lengths
    len = []
    l = 1
    while l <= n:
        r = n // (n // l)
        len.append(r - l + 1)
        l = r + 1

    # Size of the len array
    q = len(len)

    # Initialize the dp table
    dp = [0] * (k * (q + 1))

    # Base case
    for j in range(1, q + 1):
        dp[j] = len[j - 1] + dp[j - 1]

    # Populating the dp table
    for i in range(1, k):
        for j in range(1, q + 1):
            dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len[j - 1]
            dp[i * (q + 1) + j] %= mod

    # Printing the result
    print(dp[k * (q + 1) - 1])

# Call the function if this module is executed as the main script
if __name__ == '__main__':
    atcoder_ABC132_F()