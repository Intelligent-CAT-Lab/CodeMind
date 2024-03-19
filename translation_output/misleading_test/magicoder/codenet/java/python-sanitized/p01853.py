import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    if n % 2 == 0:
        print(0, end='')
        for _ in range(n // 2):
            print(' 0', end='')
        for _ in range(n // 2):
            print(' ' + str(m), end='')
    else:
        print(0, end='')
        for _ in range(n // 2):
            print(' 0', end='')
        for _ in range(n // 2 + 1):
            print(' ' + str(m), end='')
    print()

if __name__ == "__main__":
    main()