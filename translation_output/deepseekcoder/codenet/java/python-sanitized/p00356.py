import sys

def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def main():
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    p = 0
    a = x
    b = y
    m = a + b - gcd(a, b)

    if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()