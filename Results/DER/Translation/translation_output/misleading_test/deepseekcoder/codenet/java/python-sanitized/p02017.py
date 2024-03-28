import sys

def p02017(h, w, x, y):
    if h * w % 2 == 1 and (x + y) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    h, w, x, y = map(int, sys.stdin.readline().split())
    p02017(h, w, x, y)