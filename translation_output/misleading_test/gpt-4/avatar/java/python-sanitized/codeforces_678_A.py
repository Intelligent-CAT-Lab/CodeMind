def calculate_new_number(n, k):
    return (n // k + 1) * k

# Test case
n, k = map(int, input().split())
print(calculate_new_number(n, k))