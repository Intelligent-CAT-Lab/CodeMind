n, x = (int(x) for x in input().split())
if x == 1 or x == 2 * n - 1:
    print("No")
    exit()

if n == 2:
    print("Yes")
    print(1)
    print(2)
    print(3)
    exit()

if x == 2:
    y = [3, 2, 1, 4]
else:
    y = [x - 1, x, x + 1, x - 2]

ANS = []
i = 1
while i < 2 * n:
    if len(ANS) == 2 * n - 1:
        break
    if i in y:
        i += 4
    if len(ANS) == n - 3:
        ANS += y
        if len(ANS) == 2 * n - 1:
            break
    ANS.append(i)
    i += 1

print("Yes")
for ans in ANS:
    print(ans)
