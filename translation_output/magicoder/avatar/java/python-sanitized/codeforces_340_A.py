import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    lcm = x * y // gcd(x, y)

    i = a
    while i % lcm != 0:
        i += 1

    j = b
    while j % lcm != 0:
        j -= 1

    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) // lcm + 1
    else:
        c = 0

    print(c)

if __name__ == "__main__":
    main()