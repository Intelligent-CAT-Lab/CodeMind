import sys

n = int(input())
k = int(input())

if k == 1:
    ans = 0
else:
    ans = n - k

print(ans)