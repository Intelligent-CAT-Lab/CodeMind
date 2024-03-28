import sys
import math

def main():
    with sys.stdin as f:
        for line in f:
            a, b, c, d = map(int, line.split())
            start = max(a, c)
            end = min(b, d)
            print(end - start if end - start > 0 else 0)

if __name__ == '__main__':
    main()