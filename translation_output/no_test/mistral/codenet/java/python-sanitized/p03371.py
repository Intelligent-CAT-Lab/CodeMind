import sys

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    x = int(input())
    y = int(input())

    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min = min(x, y)
        max = max(x, y)
        res = 0
        res += 2 * c * min
        if max == x:
            res += min(a, 2 * c) * (max - min)
        else:
            res += min(b, 2 * c) * (max - min)
        print(res)

if __name__ == "__main__":
    main()