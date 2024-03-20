N, K, S = map(int, input().split())
if K == 0:
    if S == 1000000000:
        print(*[1 for i in range(N)])
    else:
        S += 1
        print(*[S for i in range(N)])
else:
    print(*[S if i < K else S + 1 for i in range(N)])