def solve(n, a, b):
    print(min(a * n, b))

# Test input
n, a, b = map(int, input().split())
solve(n, a, b)