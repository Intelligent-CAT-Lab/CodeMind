import sys

s = input()
x, y = 0, 0
co = [(x, y)]

for c in s:
    if c == 'L':
        x -= 1
    elif c == 'R':
        x += 1
    elif c == 'U':
        y += 1
    elif c == 'D':
        y -= 1
    co.append((x, y))

for i in range(len(co) - 3):
    for j in range(i + 3, len(co)):
        dx, dy = co[i][0] - co[j][0], co[i][1] - co[j][1]
        if dx < 0:
            dx *= -1
        if dy < 0:
            dy *= -1
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            print("BUG")
            sys.exit(0)

print("OK")