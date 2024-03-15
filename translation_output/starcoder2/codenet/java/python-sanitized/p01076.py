import sys

def main():
    N, d = map(int, sys.stdin.readline().split())
    if d == 1:
        print(N * (N - 1) // 2)
    elif d == 2:
        print(N * (N - 1) // 2 - 1)
    else:
        m = N - d
        ans = m * (m - 1) // 2 + 2 * m + (d - 2)
        print(ans)

if __name__ == '__main__':
    main()