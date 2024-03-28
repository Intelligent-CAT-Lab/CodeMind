import math
import sys

def main():
    n = int(input())
    lis = []
    a = 9
    b = 10
    for i in range(1, 10):
        lis.append((i, -11+i))
    lis.append((19, -1))
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w*b+a
            y = x
            e = 0
            while x > 0:
                e += x%10
                x //= 10
            lis.append((y, y/e))
        b *= 10
        a *= 10
        a += 9
    lis.sort(key=lambda x: x[1])
    max = 0
    for w in range(len(lis)):
        if max < lis[w][0]:
            print(lis[w][0])
            n -= 1
            if n == 0:
                break

main()