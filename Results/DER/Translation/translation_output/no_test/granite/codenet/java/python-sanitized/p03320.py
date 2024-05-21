import sys
import math

def main():
    n = int(input())
    c = 9
    d = 10
    ans = []
    for i in range(1, 10):
        ans.append((i, -11 + i))
    ans.append((19, -1))

    for i in range(1, 15):
        for j in range(1, 1000):
            x = j * d + c
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            ans.append((y, y / e))
        d *= 10
        c *= 10
        c += 9

    ans.sort(key=lambda x: x[0])
    for i in range(n):
        print(ans[i][0])

if __name__ == '__main__':
    main()