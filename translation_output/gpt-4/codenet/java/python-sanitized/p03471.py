X, Y = map(int, input().split())

sum = 0
judge = False
a = b = c = 0

for i in range(X + 1):
    for k in range(X - i + 1):
        sum = 10000 * i + 5000 * k + 1000 * (X - i - k)
        if sum == Y:
            judge = True
            a, b, c = i, k, X - i - k
            break
    if judge:
        break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")