def p03963(N, K):
    ans = K
    for i in range(2, N + 1):
        ans *= K - 1
    return ans

# Test the case with input: 2 2
if __name__ == "__main__":
    N, K = map(int, input().split())
    result = p03963(N, K)
    print(result)