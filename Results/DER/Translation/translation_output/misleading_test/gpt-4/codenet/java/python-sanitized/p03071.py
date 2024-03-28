def calculate_sum(A, B):
    c = 0
    for i in range(2):
        if A >= B:
            c += A
            A = A - 1
        else:
            c += B
            B = B - 1
    return c

# Test input
A, B = map(int, input().split())
result = calculate_sum(A, B)
print(result)