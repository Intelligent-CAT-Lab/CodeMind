import math

def main():
    r, c, a1, a2, b1, b2 = map(int, input().split())
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    C = min(x, y)
    b = 1
    for i in range(C):
        b = b * (x + y - i) // (i + 1)
    print(b * z % 100000007)

if __name__ == "__main__":
    main()