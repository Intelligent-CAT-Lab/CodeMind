MOD = 10**9 + 7


def main(n, m):
    # Initialize the 3D dp list with the required dimensions and fill with zeros
    dp = [[[0 for _ in range(2)] for _ in range(n + 1)] for _ in range(2)]
    
    # Initialize the base cases as per the original code
    dp[0][0][1] = 1
    for i in range(1, n+1):
        dp[0][i][0] = 1

    #