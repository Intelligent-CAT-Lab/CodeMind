import sys

def search(x, y):
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0
    f, f1 = 1, 1
    f2 = 0
    p = 0
    while True:
        if x_min <= x and x <= x_max and y_min <= y and y <= y_max:
            return p % 3 + 1
        f = f1 + f2
        if p % 4 == 0:
            x_max += f
        elif p % 4 == 1:
            y_max += f
        elif p % 4 == 2:
            x_min -= f
        else:
            y_min -= f
        f2 = f1
        f1 = f
        p += 1

def solve():
    x, y = map(int, sys.stdin.readline().split())
    print(search(x, y))

if __name__ == '__main__':
    solve()