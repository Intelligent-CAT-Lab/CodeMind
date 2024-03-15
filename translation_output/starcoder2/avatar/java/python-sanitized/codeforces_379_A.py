a, b = map(int, input().split())
res = a
while a >= b:
    res += a // b
    a = a // b + a % b
print(res)