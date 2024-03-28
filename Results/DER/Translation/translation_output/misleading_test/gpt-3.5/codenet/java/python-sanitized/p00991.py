from math import factorial

def main():
    r, c, a1, a2, b1, b2 = map(int, input().split())
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    C = min(x, y)
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    result = 1
    for i in range(C):
        result *= x + y - i
        result //= i + 1
    print(result * z % 100000007)

if __name__ == "__main__":
    main()