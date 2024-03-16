N = int(input())
X = N
fx = 0
while N >= 10:
    fx += N % 10
    N //= 10
fx += N
if X % fx == 0:
    print("Yes")
else:
    print("No")

/Python/p0350