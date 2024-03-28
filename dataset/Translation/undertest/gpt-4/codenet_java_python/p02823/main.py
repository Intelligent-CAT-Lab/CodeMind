def solve(n, a, b):
    if a > b:
        a, b = b, a
    if (b - a) % 2 == 1:
        ans1 = a - 1 + (b - a + 1) // 2
        a, b = n - b + 1, n - a + 1
        if a > b:
            a, b = b, a
        ans2 = a - 1 + (b - a + 1) // 2
        return min(ans1, ans2)
    else:
        return (b - a) // 2

# Read input from standard input
n, a, b = map(int, input().split())
# Call solve function and print the result to standard output
print(solve(n, a, b))