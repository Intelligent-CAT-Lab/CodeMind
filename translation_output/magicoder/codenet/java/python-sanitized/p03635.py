import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    print((n-1)*(m-1))

if __name__ == "__main__":
    main()