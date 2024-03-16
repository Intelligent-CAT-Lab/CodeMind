import sys
import math

def main():
    N = int(input())
    if N == 1:
        print(1)
        return
    c = 1
    while 2 * c - 1 <= N:
        c *= 2
    c -= 1
    print(math.bit_count(c))

if __name__ == "__main__":
    main()