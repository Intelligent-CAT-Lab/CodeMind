import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

if A + B > 23:
    ans = A + B - 24
else:
    ans = A + B

print(ans)