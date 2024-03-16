import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    print(min(A, B), max(0, A + B - N))

if __name__ == "__main__":
    main()