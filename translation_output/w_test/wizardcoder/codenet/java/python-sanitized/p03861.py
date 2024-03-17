import math

a, b, x = map(int, input().split())

count = math.ceil(b/x) - math.ceil(a/x)

if a % x == 0:
    count += 1

print(count)