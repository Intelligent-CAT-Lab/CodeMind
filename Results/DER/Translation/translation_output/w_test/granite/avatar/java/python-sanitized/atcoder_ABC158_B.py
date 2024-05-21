import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    print(base * A + mod)

if __name__ == '__main__':
    main()