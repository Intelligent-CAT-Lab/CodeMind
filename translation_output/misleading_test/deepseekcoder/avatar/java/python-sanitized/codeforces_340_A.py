import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while b != 0:
        a, b = b, a % b
    return a

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    lcm = x * y // gcd(x, y)
    i = next((i for i in range(a, b+1) if i % lcm == 0), None)
    j = next((j for j in range(b, a-1, -1) if j % lcm == 0), None)
    if i is not None and j is not None:
        c = (j - i) // lcm + 1
    else:
        c = 0
    print(c)

if __name__ == "__main__":
    main()