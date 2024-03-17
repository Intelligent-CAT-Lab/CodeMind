import sys

X, Y = map(int, sys.stdin.readline().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")