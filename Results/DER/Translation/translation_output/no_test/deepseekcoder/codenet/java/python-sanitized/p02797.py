import sys

def main():
    N, K, S = map(int, sys.stdin.readline().split())
    if K == 0:
        if S == 10**9:
            print(' '.join(['1' for _ in range(N)]))
        else:
            S += 1
            print(' '.join([str(S) for _ in range(N)]))
    else:
        for i in range(N):
            if i < K:
                print(S, end=' ')
            else:
                if S == 10**9:
                    print('1', end=' ')
                else:
                    print(S + 1, end=' ')

if __name__ == "__main__":
    main()