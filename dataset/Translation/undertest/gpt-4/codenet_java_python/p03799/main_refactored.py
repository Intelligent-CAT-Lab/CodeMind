class main:
    # Read the input string and split it into N and M as integers
    N, M = map(int, input().split())
    
    # Initialize the answer variable
    ans = 0
    
    # Check the various conditions and calculate the answer
    if N > M:
        print(M // 2)
        exit(0)
    
    if N == 1 and M == 1:
        print(0)
        exit(0)
    
    if N == 2 and M == 1:
        print(0)
        exit(0)
    
    if N * 2 > M:
        print(M // 2)
        exit(0)
    
    ans = N + ((M - N * 2) // 4)
    
    #