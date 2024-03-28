import sys

def main():
    input = sys.stdin.readline
    N, A, B = map(int, input().split())
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    print(base * A + mod)

if __name__ == '__main__':
    main()