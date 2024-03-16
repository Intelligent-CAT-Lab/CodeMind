import sys

s = sys.stdin.readline().strip()
co = [[0 for i in range(101)] for j in range(2)]
x = 0
y = 0
k = 0
co[0][k] = x
co[1][k] = y
k += 1

for i in range(len(s)):
    if s[i] == 'L':
        x -= 1
    elif s[i] == 'R':
        x += 1
    elif s[i] == 'U':
        y += 1
    elif s[i] == 'D':
        y -= 1
    co[0][k] = x
    co[1][k] = y
    k += 1

flag = True
for i in range(k - 3):
    for j in range(i + 3, k):
        dx = co[0][i] - co[0][j]
        dy = co[1][i] - co[1][j]
        if dx < 0:
            dx *= (-1)
        if dy < 0:
            dy *= (-1)
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break

if flag:
    print("OK")
else:
    print("BUG")