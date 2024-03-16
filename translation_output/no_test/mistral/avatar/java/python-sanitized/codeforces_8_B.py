import sys

def main():
    n = int(input())
    s = input()
    x, y = 0, 0
    co = [[0 for j in range(n)] for i in range(2)]
    co[0][0] = x
    co[1][0] = y
    for i in range(1, n):
        if s[i] == 'L':
            x -= 1
        elif s[i] == 'R':
            x += 1
        elif s[i] == 'U':
            y += 1
        elif s[i] == 'D':
            y -= 1
        co[0][i] = x
        co[1][i] = y
    for i in range(1, n - 3):
        for j in range(i + 3, n):
            dx = co[0][i] - co[0][j]
            dy = co[1][i] - co[1][j]
            if dx < 0:
                dx *= -1
            if dy < 0:
                dy *= -1
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break
    if flag:
        print("OK")
    else:
        print("BUG")

if __name__ == "__main__":
    main()