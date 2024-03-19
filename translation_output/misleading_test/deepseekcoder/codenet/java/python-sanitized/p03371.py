import sys

def main():
    a, b, c, x, y = map(int, sys.stdin.readline().split())

    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min_val = min(x, y)
        max_val = max(x, y)
        res = 0
        res += 2 * c * min_val
        if max_val == x:
            res += min(a, 2 * c) * (max_val - min_val)
        else:
            res += min(b, 2 * c) * (max_val - min_val)
        print(res)

if __name__ == "__main__":
    main()