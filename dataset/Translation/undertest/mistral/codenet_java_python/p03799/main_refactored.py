class main:
    N, M = map(int, input().split())
    ans = 0
    
    if N > M:
        print(M // 2)
        exit()
    
    if N == 1 and M == 1:
        print(0)
        exit()
    
    if N == 2 and M == 1:
        print(0)
        exit()
    
    if N * 2 > M:
        print(M // 2)
        exit()
    
    ans = N + ((M - N * 2) // 4)
    
    for N, M in zip(range(1, N+1), range(N+1, M+1)):
        if M - 2 >= (N + 1) * 2:
            N, M = N+1, M-2
        else:
            break
    
    print(ans)