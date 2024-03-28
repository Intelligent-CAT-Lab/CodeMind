def calculate_ans(N, K):
    ans = K
    for i in range(2, N + 1):
        ans *= (K - 1)
    return ans

# Read input from the user
N, K = map(int, input().split())

ans = calculate_ans(N, K)

# Print the result
print(ans)