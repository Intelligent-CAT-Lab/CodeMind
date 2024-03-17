import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    base = n*100+m*1800
    print(base << m)

if __name__ == '__main__':
    main()