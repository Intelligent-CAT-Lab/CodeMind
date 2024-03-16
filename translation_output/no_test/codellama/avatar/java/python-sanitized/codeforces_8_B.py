import sys

def main():
    s = sys.stdin.readline().strip()
    x, y = 0, 0
    coords = [(x, y)]
    for c in s:
        if c == 'L':
            x -= 1
        elif c == 'R':
            x += 1
        elif c == 'U':
            y += 1
        elif c == 'D':
            y -= 1
        coords.append((x, y))
    for i in range(len(coords) - 3):
        for j in range(i + 3, len(coords)):
            dx = abs(coords[i][0] - coords[j][0])
            dy = abs(coords[i][1] - coords[j][1])
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                print("BUG")
                return
    print("OK")

if __name__ == "__main__":
    main()