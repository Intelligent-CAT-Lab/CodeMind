import sys

def main():
    N, K, S = map(int, sys.stdin.readline().split())
    if K == 0:
        if S == 1000000000:
            for i in range(N):
                print(1, end=' ')
        else:
            S += 1
            for i in range(N):
                print(S, end=' ')
    else:
        for i in range(N):
            if i < K:
                print(S, end=' ')
            else:
                if S == 1000000000:
                    print(1, end=' ')
                else:
                    print(S + 1, end=' ')

if __name__ == '__main__':
    main()