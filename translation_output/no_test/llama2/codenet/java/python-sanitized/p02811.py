import sys

K = int(sys.stdin.readline())
X = int(sys.stdin.readline())

if X <= 500*K:
    print("Yes")
else:
    print("No")