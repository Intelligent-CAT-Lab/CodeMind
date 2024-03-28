s = input()
x, y = 0, 0
co = [(x, y)]

for ch in s:
    if ch == 'L':
        x -= 1
    elif ch == 'R':
        x += 1
    elif ch == 'U':
        y += 1
    elif ch == 'D':
        y -= 1
    co.append((x, y))

flag = True
for i in range(len(co) - 3):
    for j in range(i + 3, len(co)):
        dx = abs(co[i][0] - co[j][0])
        dy = abs(co[i][1] - co[j][1])
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break

if flag:
    print("OK")
else:
    print("BUG")