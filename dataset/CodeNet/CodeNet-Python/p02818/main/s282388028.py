a, b, k = list(map(int, input().split()))
if a <= k:
    k -= a
    a = 0
else:
    print((a - k, b))
    exit()
print((0, max(b - k, 0)))
