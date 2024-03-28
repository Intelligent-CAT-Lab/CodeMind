class main:
    # Input: read from stdin
    N, K, S = map(int, input().split())
    
    # Output: write to stdout
    if K == 0:
        if S == 1000000000:
            for i in range(N):
                print("1", end=" ")
        else:
            S += 1
            for i in range(N):
                print(S, end=" ")
    else:
        for i in range(N):
            if i < K:
                print(S, end=" ")
            else:
                if S == 1000000000:
                    print("1", end=" ")
                else:
                    print(S + 1, end=" ")
    
    # No explicit flushing is necessary as print automatically flushes the output by default in Python