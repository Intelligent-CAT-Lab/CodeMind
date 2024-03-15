import sys
from math import gcd

def lcm(a, b):
    return a * b // gcd(a, b)

def find_multiples(a, b, lcm):
    for i in range(a, b+1):
        if i % lcm == 0:
            return i
    return None

def main():
    # Reading input from stdin and splitting into variables
    x, y, a, b = map(int, input().split())

    c = 0
    lcm_xy = lcm(x, y)

    # Finding the first multiple of lcm_xy that is >= a
    first = find_multiples(a, b, lcm_xy)
    # Finding the last multiple of lcm_xy that is <= b
    last = find_multiples(b, a, lcm_xy)

    # Check if found multiples in the range [a, b]
    if first is not None and last is not None:
        c = (last - first) // lcm_xy + 1

    # Printing result to stdout
    print(c)

if __name__ == '__main__':
    main()