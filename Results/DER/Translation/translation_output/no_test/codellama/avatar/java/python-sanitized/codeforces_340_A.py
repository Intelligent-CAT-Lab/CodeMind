import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    lcm = x * y // gcd(x, y)
    c = 0
    for i in range(a, b+1):
        if i % lcm == 0:
            c += 1
    print(c)

if __name__ == "__main__":
    main()