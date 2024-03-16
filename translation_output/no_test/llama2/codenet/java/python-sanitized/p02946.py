import sys

K = int(sys.stdin.readline())
X = int(sys.stdin.readline())

for i in range(X - K + 1, X + K - 1):
    if i != X + K - 1:
        print(i, end=' ')
    else:
        print(i)