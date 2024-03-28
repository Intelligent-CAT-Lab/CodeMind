class main:
    import sys
    
    N, K, S = map(int, sys.stdin.readline().split())
    
    if K == 0:
        if S == 1000000000:
            print("1 " * N)
        else:
            S += 1
            print(S, end=" ")
            print("1 " * (N - 1))
    else:
        for i in range(N):
            if i < K:
                print(S, end=" ")
            else:
                if S == 1000000000:
                    print("1", end=" ")
                else:
                    print(S + 1, end=" ")