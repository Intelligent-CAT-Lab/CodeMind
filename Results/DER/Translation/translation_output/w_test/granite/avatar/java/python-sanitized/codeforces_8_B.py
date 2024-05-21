import sys

def main():
    s = input()
    x, y = 0, 0
    for c in s:
        if c == 'L':
            x -= 1
        elif c == 'R':
            x += 1
        elif c == 'U':
            y += 1
        elif c == 'D':
            y -= 1
    for i in range(len(s)):
        for j in range(i + 3, len(s)):
            dx, dy = x - (x - s[i:j].count('L') + s[i:j].count('R')), y - (y - s[i:j].count('D') + s[i:j].count('U'))
            if abs(dx) <= 1 and abs(dy) <= 1:
                print('BUG')
                return
    print('OK')

if __name__ == "__main__":
    sys.exit(main())