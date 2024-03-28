def calculate_salary(N, M):
    X = 1900 * M + 100 * (N - M)
    rate = 1

    for i in range(1, M + 1):
        rate *= 2

    return rate * X

# Test case
N, M = map(int, input().split())
print(calculate_salary(N, M))