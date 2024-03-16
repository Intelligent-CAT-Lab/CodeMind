from sys import stdin, stdout
from collections import namedtuple
from math import *
from heapq import *
 
def main():
    n = int(input())
    d = [0]*1000

    P = namedtuple('P', ['x', 'd'], defaults=(0, 0))
    lis = [P(i, -11+i) for i in range(1, 10)]
    lis.append(P(19, -1))

    a, b = 9, 10
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w*b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, float(y)/e))
        b *= 10
        a *= 10
        a += 9

    lis.sort()
    max_val = 0
    for p in lis:
        if max_val < p.x:
            max_val = p.x
            stdout.write(str(max_val) + '\n')
            n -= 1
            if n == 0:
                break

    stdout.flush()

if __name__ == '__main__':
    main()