def codeforces_30_A(A, B, N):
    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            return x
    return "No solution"

# Test input
A = 7
B = 896
N = 7

# Call the function with test input
print(codeforces_30_A(A, B, N))