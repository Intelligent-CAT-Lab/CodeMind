h, a = map(int, input().split())

n = h//a
if h%a > 0:
    n += 1

print(n)