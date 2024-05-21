import sys

def main():
    N, d = map(int, sys.stdin.readline().split())
    if d == 1:
        ans = N * (N - 1) // 2
    elif d == 2:
        ans = N * (N - 1) // 2 - 1
    else:
        ans = (N - d) * (N - d - 1) // 2 + 2 * (N - d) + (d - 2)
    print(ans)

if __name__ == '__main__':
    main()