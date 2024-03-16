import sys

def main():
    input = sys.stdin.readline
    N, K, S = map(int, input().split())
    if K == 0:
        if S == 1000000000:
            print(*[1] * N)
        else:
            S += 1
            print(*[S] * N)
    else:
        print(*[S] * K, end=' ')
        if S == 1000000000:
            print(1, end=' ')
        else:
            print(S + 1, end=' ')
        print(*[S + 1] * (N - K))

if __name__ == '__main__':
    main()