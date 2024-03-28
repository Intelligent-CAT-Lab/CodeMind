import sys

def main():
    n = int(sys.stdin.readline())
    print(n, end=':')
    for i in range(2, n+1):
        while n % i == 0:
            print(' ', i, end='')
            n = n // i
    print(' ', n)

if __name__ == '__main__':
    main()