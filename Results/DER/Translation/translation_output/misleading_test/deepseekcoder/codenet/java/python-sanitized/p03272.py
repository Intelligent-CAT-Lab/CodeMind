import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    print(N-K+1)

if __name__ == "__main__":
    main()