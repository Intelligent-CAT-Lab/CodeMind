import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)