import sys

def gcd(a, b):
    while b!= 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def main():
    x, y = map(int, sys.stdin.readline().split())
    m = lcm(x, y)
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()