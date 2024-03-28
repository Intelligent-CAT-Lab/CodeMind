import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    start = max(a, c)
    end = min(b, d)
    print(end - start)

if __name__ == '__main__':
    main()