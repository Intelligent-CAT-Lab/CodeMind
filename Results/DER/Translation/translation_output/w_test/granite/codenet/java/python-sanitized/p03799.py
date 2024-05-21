import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    ans = 0

    if N > M:
        ans = M // 2
    elif N == 1 and M == 1:
        ans = 0
    elif N == 2 and M == 1:
        ans = 0
    elif N * 2 > M:
        ans = M // 2
    else:
        ans = N + ((M - N * 2) // 4)

    print(ans)

if __name__ == '__main__':
    main()