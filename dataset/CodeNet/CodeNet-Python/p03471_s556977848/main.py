n, y = map(int, input().split())

flag = False
for i in range(n + 1):
    for j in range(n + 1 - i):
        res = y - 10000 * i - 5000 * j
        if res // 1000 == n - i - j:
            print(i, j, res // 1000)
            flag = True
            break
    if flag:
        break
else:
    print(-1, -1, -1)
