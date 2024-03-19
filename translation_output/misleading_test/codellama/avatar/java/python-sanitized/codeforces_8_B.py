import sys

def main():
    s = sys.stdin.readline().strip()
    ch = list(s)
    co = [[0] * 101 for _ in range(2)]
    x, y, k = 0, 0, 0
    co[0][k] = x
    co[1][k] = y
    k += 1

    for c in ch:
        if c == 'L':
            x -= 1
        elif c == 'R':
            x += 1
        elif c == 'U':
            y += 1
        elif c == 'D':
            y -= 1
        co[0][k] = x
        co[1][k] = y
        k += 1

    for i in range(k - 3):
        for j in range(i + 3, k):
            dx = co[0][i] - co[0][j]
            dy = co[1][i] - co[1][j]
            if dx < 0:
                dx *= -1
            if dy < 0:
                dy *= -1
            if dx <= 1 and dy == 0 or dy <= 1 and dx == 0:
                print("BUG")
                return
    print("OK")

if __name__ == "__main__":
    main()