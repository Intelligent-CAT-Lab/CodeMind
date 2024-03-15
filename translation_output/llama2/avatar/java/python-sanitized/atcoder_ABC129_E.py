import sys

n = int(sys.stdin.readline())
a = [int(x) for x in sys.stdin.readline().split()]

ans = 0
for i in range(n):
    if a[i]:
        ones = n - i - 1
        cur = (1000000007 ** ones) % 1000000007
        ans += cur
    else:
        pass

print(ans)