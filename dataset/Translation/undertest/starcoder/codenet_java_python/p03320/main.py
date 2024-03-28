import sys
import math

def main():
    n = int(sys.stdin.readline())
    a = 9
    b = 10
    lis = []
    for i in range(1, 10):
        lis.append((i, -11+i))
    for i in range(1, 15):
        for j in range(1, 1000):
            x = j*b+a
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
    for i in range(len(lis)):
        if max < lis[i][0]:
            max = lis[i][0]
            print(max)
            n -= 1
            if n == 0:
                break

if __name__ == '__main__':
    main()