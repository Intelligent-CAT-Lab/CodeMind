import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()