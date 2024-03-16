N, K, S = map(int, input().split())
if K == 0:
    if S == 1000000000:
        print("1 " * N)
    else:
        S += 1
        print(S, end=" ")
        print(" " * (N - 1))
else:
    for i in range(N):
        if i < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print("1", end=" ")
            else:
                print(S + 1, end=" ")