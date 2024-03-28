import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    s = [x for x in range(1, A + B + 1) if A % x == 0 and B % x == 0]
    print(s[K - 1])

if __name__ == "__main__":
    main()