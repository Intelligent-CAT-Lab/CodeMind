import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def main():
    z = sys.stdin.readline().split()
    x, y, a, b = map(int, z)
    lcm = x * y // gcd(x, y)

    i = next(i for i in range(a, b+1) if i % lcm == 0)
    j = next(j for j in range(b, a-1, -1) if j % lcm == 0)

    if i % lcm == 0 and j % lcm == 0:
        c = (j - i) // lcm + 1
    else:
        c = 0

    print(c)

if __name__ == "__main__":
    main()