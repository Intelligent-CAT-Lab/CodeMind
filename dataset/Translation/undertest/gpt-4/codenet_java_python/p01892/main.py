def solve(A, B, N):
    ans = abs(A - B)
    for i in range(1, N + 1):
        for j in range(1, N + 1):
            if i * B % j != 0:
                continue
            ans = min(ans, abs(A - i * B // j))
    return ans

# Sample test case
# Test input: 19 30 3
# Expected output: 1

if __name__ == '__main__':
    # Getting input from the user
    A, B, N = map(int, input().split())

    # Compute and print the output
    print(solve(A, B, N))