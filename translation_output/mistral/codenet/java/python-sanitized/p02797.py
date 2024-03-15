import sys

N, K, S = map(int, input().split())

if K == 0:
    if S == 1000000000:
        print("1" * N)
    else:
        S += 1
        print(S, end=" ")
        for _ in range(N - 1):
            print(S, end=" ")
else:
    for _ in range(N):
        if _ < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print("1")
            else:
                print(S + 1, end=" ")
                print(" ", end="")