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
    i = a
    while i % lcm != 0:
        i += 1
    j = b
    while j % lcm != 0:
        j -= 1
    if i % lcm == 0 and j % lcm == 0:
        c = (j - i) // lcm + 1
    else:
        c = 0
    print(c)

if __name__ == "__main__":
    main()