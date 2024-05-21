def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

a, b = map(int, input().split())
ans = get_num(a, b)
print(ans)