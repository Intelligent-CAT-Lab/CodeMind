import java.util
import java.io

def main():
    a = int(input())
    b = int(input())
    r1 = a
    x1 = 1
    y1 = 0
    r2 = b
    x2 = 0
    y2 = 1
    r3, q, x3, y3 = 0, 0, 0, 0
    while r2 != 0:
        q = r1 / r2
        r3 = r1 % r2
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1 = r2
        r2 = r3
        x1 = x2
        x2 = x3
        y1 = y2
        y2 = y3
    print(x1, y1)


if __name__ == '__main__':
    main()