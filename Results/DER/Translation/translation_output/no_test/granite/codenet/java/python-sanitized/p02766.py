import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 0
    while n > 0:
        n //= k
        ans += 1
    print(ans)

if __name__ == '__main__':
    main()