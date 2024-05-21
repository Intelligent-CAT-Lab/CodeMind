def to_string(x):
    return ''.join(str(x % 2) for _ in range(32))[::-1]

a, b = map(int, input().split())
print(to_string(a & b))
print(to_string(a | b))
print(to_string(a ^ b))