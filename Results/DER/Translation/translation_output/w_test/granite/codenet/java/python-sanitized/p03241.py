def find_largest_divisor(n, m):
    for i in range(m // n, 0, -1):
        if m % i == 0:
            return i

n = 3
m = 14
result = find_largest_divisor(n, m)
print(result)