import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print(n-k+1)

if __name__ == "__main__":
    main()