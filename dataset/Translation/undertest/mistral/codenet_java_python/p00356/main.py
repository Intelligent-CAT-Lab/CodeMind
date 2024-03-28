# Python implementation of p00356

def main():
    x, y = map(int, input().split())
    p = 0
    a, b, z, m = x, y, 0, 0
    while x % y != 0:
        z, x, y = x, y, z % y
    m = a + b - y

    if (a % 2 == 0 or b % 2 == 0 or a == b or a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()